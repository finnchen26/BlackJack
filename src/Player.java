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

    }

    public void print(){
        for(int i = 0; i < hand.length; i++){
            hand[i].print();
        }
        if(isPlayer){
            System.out.println("Hi! " + name);
            System.out.println("You have " + cardsValue + " points");
        }
        else{
            System.out.println("Dealer info");
        }
        for(int i = 0; i < hand.length; i++){
            hand[i].print();
        }
    }

    public void addCard(Card c){
        hand[numCards] = c;
        numCards = numCards + 1;
        cardsValue = cardsValue + c.value;
    }

}
