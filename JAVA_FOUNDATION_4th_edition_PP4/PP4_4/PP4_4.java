package JAVA_FOUNDATION_4th_edition_PP4.PP4_4;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-27.
 */
public class PP4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String A = scan.nextLine();

        for(int i=0; i<A.length(); i++){
            System.out.println(A.charAt(i));
        }

    }
}
