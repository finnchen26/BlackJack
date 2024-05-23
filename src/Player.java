public class Player {
    //current value of cards
    public int cardsValue;
    //hand - what cards you have
    public Card[] hand;
    //name of player
    public String name;
    //is dealer or player
    public boolean isPlayer;
    //choose to hit
    //choose to stay

    public int numCards;

    public Player(){
        cardsValue = 0;
        name = "Finn";
        isPlayer = true;
        hand = new Card[2];
        numCards = 0;

    }

    public void print(){
        for(int i = 0; i < hand.length; i++){
            hand[i].print();
        }
        if(isPlayer){
            System.out.println("Hi! " + name);
            System.out.println("You have " + cardsValue + " points");

            for(int i = 0; i < hand.length; i++){
                hand[i].print();
            }
        }
        else{
            System.out.println("Dealer info");
            System.out.println("the dealer has " + hand[0].value + " points");
            hand[0].print();
        }



    }

    public void addCard(Card c){
        if (numCards>=2){
            Card [] moreCards = new Card[hand.length + 1];
            for (int i = 0; i < 2; i++){
                moreCards[i] = hand[i];
            }
            hand = moreCards;
        }
        hand[numCards] = c;
        numCards = numCards + 1;
        cardsValue = cardsValue + c.value;
    }

}
