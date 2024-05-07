public class Card {
    //suit (heart, club, spade, diamond)
    public String suit;
    //value (card worth 1-11 points in game)
    public int value;
    //type (ace, 1, 2, Jack...)
    public String type;


    public Card(int pType, int pSuit){
        if(pType == 0){
            type = "Ace";
        }
        else if (pType == 1){
            type = "Two";
        }
        if (pSuit == 1){
            suit = "Spades";
        }



        //TODO: write if statements that set the value of "value" based on type
        //value =
    }

    public void print(){
        System.out.println("The" + type + " of " + suit + " is worth " + value + " points.");

    }
}
