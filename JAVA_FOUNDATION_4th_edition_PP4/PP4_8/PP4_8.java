package JAVA_FOUNDATION_4th_edition_PP4.PP4_8;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-27　gitup.
 */
public class PP4_8 {

    public static void main(String[] args) {
        int userInput;
        int randomNum;
        Scanner scan = new Scanner(System.in);

        int end = 0;
        while (end == 0) {
            Random A = new Random();
            randomNum = A.nextInt(99) + 1;
            System.out.println(randomNum);
            int status = 0;
            while (status == 0) {
                System.out.println("enter Guess Number from 1 to 100");
                userInput = scan.nextInt();
                if (userInput == randomNum) {
                    status = 1;
                } else {
                    if (userInput > randomNum) {
                        System.out.println("more smaller number\n try again(0) or quite(1)?");
                        status = scan.nextInt();
                    } else {
                        System.out.println("more bigger number\n like try again(0) or quite(1)?");
                        status = scan.nextInt();
                        System.out.println(status);
                    }
                }
            }
            System.out.println("would you like get new Number (0) or stop(1)?");
            end = scan.nextInt();
            if (end == 1) {//stop
                break;
            }

        }
    }
}
