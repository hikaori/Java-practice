package JAVA_FOUNDATION_4th_edition_PP4.PP4_3;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-26.
 */
public class PP4_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("enter number");
            int inputN = scan.nextInt();

            if (inputN <= 2) {
                System.out.println("enter big Number more than 2");
            } else {
                //print the sum of all even integers between 2
                int sum = 0;
                for (int i = 0; i < inputN; i++) {
                    if ((i + 2) % 2 == 0) { //even integers
                        sum += i;
                    } else { //not even integers
                    }
                }
                System.out.println(sum-2);
                break;
            }
        }
    }
}
