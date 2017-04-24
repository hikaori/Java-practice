package JAVA_FOUNDATION_4th_edition_PP2;

import java.util.Scanner;

public class PP2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put first of three integers");
        int Num1 = scan.nextInt();
        System.out.println("put second of three integers");
        int Num2 = scan.nextInt();
        System.out.println("put third of three integers");
        int Num3 = scan.nextInt();
        int Average = (Num1 + Num2 + Num3) / 3;
        System.out.println("Average is" + Average);
    }
}

