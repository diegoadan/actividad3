import java.util.*;


public class Deck {


    public Queue<Card> Cards = new LinkedList<Card>();
    public List<Card> lastHand;

    public Deck() {
        generarDeck();
    }
    public void generarDeck(){
        String[] Palos = {"Tréboles", "Corazones", "Diamantes", "Espadas"};
        for (String Palo:Palos) {
            for (int i = 1; i < 14; i++) {
                Cards.add( new Card(Palo, i,
                        ((Palo.equals("Corazones") || Palo.equals("Diamantes")) ? "Rojo" : "Negro"))
                );

            }
        }
    }
    public void shuffle(){
        System.out.println("\nFunción shuffle() :");
        Collections.shuffle((LinkedList<Card>)Cards);
        System.out.println("Se mezcló el Deck");
    }
    public void head(){
        System.out.println("\nFunción head() :");
        Card carta = Cards.poll();
        System.out.println(carta.ToString());
        System.out.println("Quedan: "+Cards.size());
    }

    public void pick(){
        System.out.println("\nFunción pick() :");
        Card carta = (Card)((LinkedList)Cards).get(new Random().nextInt(Cards.size()));
        Cards.remove(carta);
        System.out.println(carta.ToString());
        System.out.println("Quedan: "+Cards.size());

    }

    public Card[] hand(){
        System.out.println("\nFunción hand() :");
        Card[] cartas = new Card[5];

        for (int i =0;i<5;i++) {
            Card carta = Cards.poll();
            if (carta!=null) {
                Cards.remove(carta);
                System.out.println(carta.ToString());
                cartas[i] = carta;
            }
        }

        System.out.printf("Quedan: %d%n", Cards.size());

        return  cartas;
    }
}
