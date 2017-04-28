package JAVA_FOUNDATION_4th_edition_PP4.PP4_5;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-27.
 */
public class PP4_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter digits an integer value");
        String Base = "abcdefg";
        int A = scan.nextInt();
        if (A > 6) {
            System.out.println("enter less than 6");
        } else {
            System.out.println(Base.charAt(A));
        }
    }
}
