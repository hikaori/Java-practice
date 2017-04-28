package JAVA_FOUNDATION_4th_edition_PP4.PP4_10_a;

/**
 * Created by kaorihirata on 2017-04-27.
 */
public class PP4_10_a {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
