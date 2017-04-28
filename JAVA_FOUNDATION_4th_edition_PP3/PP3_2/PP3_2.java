package JAVA_FOUNDATION_4th_edition_PP3.PP3_2;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-23.
 */
public class PP3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put integer Number for A");
        int A = scan.nextInt();
        System.out.println("put integer Number for B");
        int B = scan.nextInt();

        double A3 = Math.pow(A,3);
        double B3 = Math.pow(B,3);

        System.out.println("Sum of A B third pow is" + (Math.pow(A,3)) + ( Math.pow(B,3)));
        System.out.println("Sum of A B third pow is" + (A3+B3));

    }

}
