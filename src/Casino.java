public class Casino {
    public static void main(String[] args) {
        Casino c = new Casino();
    }

    public Card[] deck;

    public Casino(){
        System.out.println("Welcome to Finn's Casino!");
        deck = new Card[52];
        int count = 0;

        for(int t = 0; t < 13; t++){
            for(int s = 0; s < 4; s++){
                if(t == 0){
                    deck[count] = new Card(t, s);
                    deck[count].print();
                    count++;
                }

            }
        }
    }
}
