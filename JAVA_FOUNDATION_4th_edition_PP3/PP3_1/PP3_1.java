package JAVA_FOUNDATION_4th_edition_PP3.PP3_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-23.
 */
public class PP3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your first name?");
        String fN = scan.nextLine();
        System.out.println("what is your last name?");
        String lN = scan.nextLine();

        Random randomNum = new Random();
//        int FinalRandNum = randomNum.nextInt(88)+10;
        System.out.println(fN.charAt(0)+lN.substring(0,5)+randomNum.nextInt((88)+10));
    }
}
