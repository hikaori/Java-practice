package JAVA_FOUNDATION_4th_edition_PP5.PP5_13;

import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-04-29.
 */
public class CardDrive {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            Card A = new Card();
//        }
//        Card A = new Card();
//        Card B = new Card();
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(A.isHigherThan(B));

//        DeckOfCards d1 = new DeckOfCards();

        DeckOfCards d1 = new DeckOfCards();
        System.out.print(d1.deal());
        System.out.println("!!!!");
        System.out.println(Arrays.toString(d1.getDeck()));
    }
}
