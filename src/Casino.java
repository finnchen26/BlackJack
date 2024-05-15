import java.util.Scanner;
public class Casino {

    public static void main(String[] args) {
        Casino c = new Casino();
    }

    public Card[] deck;
    public Player dealer;
    public Player p;

    public Casino(){
        System.out.println("Welcome to Finn's Casino!");

        makeDeck();
        shuffle();
        printDeck();
        dealer = new Player();
        p = new Player();
        deal();
        dealer.print();
        p.print();
        System.out.println(p.isPlayer);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println(userName);
        p.name = userName;
        p.print();
    }



    public void makeDeck(){
        deck = new Card[52];
        int count = 0;

        for(int t = 0; t < 13; t++){
            for(int s = 0; s < 4; s++){

                deck[count] = new Card(t, s);
                deck[count].print();
                count++;

            }
        }
    }

    public void shuffle(){
        //for loop
        for (int x = 0; x < 52; x++){
            //grab rand card and swap with the current index (x)
            int randomIndex = (int)(Math.random()*52);
            Card randomCard = deck[randomIndex];
            //swap
            Card temp = deck[x];
            deck[x] = randomCard;
            deck[randomIndex] = temp;
        }

    }

    public void printDeck(){
        for (int i = 0; i < deck.length; i++){
            deck[i].print();
        }
    }


    public void deal(){
//        p.hand[0] = deck[0];
//        p.hand[1] = deck[1];

        p.addCard(deck[0]);
        p.addCard(deck[1]);
        dealer.hand[0] = deck[2];
        dealer.hand[1] = deck[3];
    }


}
