public class Card {
    //suit (heart, club, spade, diamond)
    public String suit;
    //value (card worth 1-11 points in game)
    public int value;
    //type (ace, 1, 2, Jack...)
    public String type;


    public Card(int pType, int pSuit) {
        if (pType == 0) {
            type = "Ace";
            value = 1;
        } else if (pType == 1) {
            type = "Two";
            value = 2;
        } else if (pType == 2) {
            type = "Three";
            value = 3;
        } else if (pType == 3) {
            type = "Four";
            value = 4;
        } else if (pType == 4) {
            type = "Five";
            value = 5;
        } else if (pType == 5) {
            type = "Six";
            value = 6;
        } else if (pType == 6) {
            type = "Seven";
            value = 7;
        } else if (pType == 7) {
            type = "Eight";
            value = 8;
        } else if (pType == 8) {
            type = "Nine";
            value = 9;
        } else if (pType == 9) {
            type = "Ten";
            value = 10;
        } else if (pType == 10) {
            type = "Jack";
            value = 10;
        } else if (pType == 11) {
            type = "Queen";
            value = 10;
        } else if (pType == 12) {
            type = "King";
            value = 10;
        }


        if (pSuit == 0) {
            suit = "Diamonds";
        }
        if (pSuit == 1) {
            suit = "Spades";
        }
        if (pSuit == 2) {
            suit = "Hearts";
        }
        if (pSuit == 3) {
            suit = "Clubs";
        }
    }



    public void print(){
        System.out.println("The " + type + " of " + suit + " is worth " + value + " points.");

    }
}

