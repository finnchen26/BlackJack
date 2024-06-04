import java.util.Scanner;
public class Casino {

    public static void main(String[] args) {
        Casino c = new Casino();
    }

    public Card[] deck;
    public Player dealer;
    public int numDealtcards;
    public Player p;

    public Casino() {
        System.out.println("Welcome to Finn's Casino!");
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println(userName);

        boolean isPlaying;
        isPlaying = true;
        while (isPlaying) {

            makeDeck();
            shuffle();
            printDeck();
            dealer = new Player();
            dealer.isPlayer = false;
            p = new Player();
            deal();
            dealer.print();
            p.print();
            System.out.println(p.isPlayer);


            p.name = userName;
            p.print();

            String decision = "";
            while (!decision.equals("stand") && p.cardsValue <= 21) {
                System.out.println();
                System.out.println("Player, Do you want to stand or hit?");
                decision = scan.nextLine();
                System.out.println(decision);
                boolean isHit;
                if (decision.equals("hit")) {
                    isHit = true;
                    System.out.println("you have decided to hit");
                } else {
                    isHit = false;
                    System.out.println("you have decided to stand");
                    p.isPlayer = false;
                }

                if (isHit) {
                    //take a card from the deck, add it to something
                    //use add card to do this
                    //update value
                    p.addCard(deck[numDealtcards]);
                    numDealtcards++;
                    System.out.println(p.hand.length);
                    p.print();
                    if (p.cardsValue > 21) {
                        System.out.println("Sorry, BUST!!!");
                    }

                } else {
                    //  p.isPlayer = false;
                    System.out.println("Player on hold...Dealer decision in action");
                    while (dealer.cardsValue < 17) {
                        isHit = true;
                        System.out.println("dealer has decided to hit");
                        if (isHit) {
                            dealer.addCard(deck[numDealtcards]);
                            numDealtcards++;
                            dealer.print();
                        }
                    }
                    isHit = false;
                    System.out.println("dealer has decided to stand");
                    System.out.println("The dealer has a final point of " + dealer.cardsValue);
                    System.out.println("Your final point is " + p.cardsValue);

                    if (dealer.cardsValue < p.cardsValue) {
                        System.out.println("Congratulations! You have won!");
                    } else if (dealer.cardsValue == p.cardsValue) {
                        System.out.println("You have tied with the dealer!");
                    } else {
                        System.out.println("Sorry, better luck next time!");
                    }

                }


            }
            System.out.println("The round has ended. Play Again or Stop Game?");
            String gameDecision = scan.nextLine();
            System.out.println(gameDecision);
            if (gameDecision.equals("Play Again")) {
                isPlaying = true;
                System.out.println("Yay! Play Again!");
            } else {
                isPlaying = false;
                System.out.println("Stopping game. Come again next time!");
            }

        }
    }


        public void makeDeck () {
            deck = new Card[52];
            int count = 0;

            for (int t = 0; t < 13; t++) {
                for (int s = 0; s < 4; s++) {

                    deck[count] = new Card(t, s);
                    deck[count].print();
                    count++;

                }
            }
        }

        public void shuffle () {
            //for loop
            for (int x = 0; x < 52; x++) {
                //grab rand card and swap with the current index (x)
                int randomIndex = (int) (Math.random() * 52);
                Card randomCard = deck[randomIndex];
                //swap
                Card temp = deck[x];
                deck[x] = randomCard;
                deck[randomIndex] = temp;
            }

        }

        public void printDeck () {
            for (int i = 0; i < deck.length; i++) {
                deck[i].print();
            }
        }


        public void deal () {
//        p.hand[0] = deck[0];
//        p.hand[1] = deck[1];

            p.addCard(deck[0]);
            p.addCard(deck[1]);
            dealer.addCard(deck[2]);
            dealer.addCard(deck[3]);
            numDealtcards = 4;
        }


    }

