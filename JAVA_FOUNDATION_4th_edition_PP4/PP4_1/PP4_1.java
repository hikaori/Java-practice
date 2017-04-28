package JAVA_FOUNDATION_4th_edition_PP4.PP4_1;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-24.
 */
public class PP4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put year");
        int userInput = scan.nextInt();

        if (userInput <= 1582) {
            System.out.println("the year the Gregorian calendar was adopted");
        }
        int by4 = userInput % 4;
        int by100 = userInput % 100;
        int by400 = userInput % 400;

        if (by4 == 0) {
            if (by100 == 0) {
                if (by400 == 0) {
                    System.out.println("this year is Leap year");
                } else
                    System.out.println("this year is No");
            } else {
                System.out.println("this year is Leap year");
            }
        } else {
            System.out.println("this year is No");
        }
    }
}
