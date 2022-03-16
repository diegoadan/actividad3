import java.lang.reflect.Array;
import java.util.Arrays;

public class Poker {

    public static void main(String[] args){

            Deck deck = new Deck();

            deck.shuffle();
            deck.head();
            deck.pick();
            deck.lastHand= Arrays.asList(deck.hand());



    }
}
