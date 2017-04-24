package JAVA_FOUNDATION_4th_edition_PP2;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-22.
 */
public class PP2_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many quarters in the jar? put the amount of quarters number");
        int quarters = scan.nextInt();
        System.out.println("How many dimes in the jar? put the amount of dimes number");
        int dimes = scan.nextInt();
        System.out.println("How many nickels in the jar? put the amount of nickels number");
        int nickels = scan.nextInt();
        System.out.println("How many pennies in the jar? put the amount of pennies number");
        int pennies = scan.nextInt();

        System.out.println("Total in the jar is" + (quarters * 25 + dimes * 10 + nickels * 5 + pennies * 1));

    }
}
