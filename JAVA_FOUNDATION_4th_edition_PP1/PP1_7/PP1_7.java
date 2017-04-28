package JAVA_FOUNDATION_4th_edition_PP1.PP1_7;

/**
 * Created by kaorihirata on 2017-04-21.
 */
public class PP1_7 {
    public static void main(String[] args) {

        int num = 9;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int m = num; m >= i; m--) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

}
