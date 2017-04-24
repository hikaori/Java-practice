package JAVA_FOUNDATION_4th_edition_PP2;

import java.util.*;

/**
 * Created by kaorihirata on 2017-04-22.
 */
public class PP2_3 {
    public static void main(String[] args) {
        double A, B;
        System.out.println("put first floating point");
        Scanner scan = new Scanner(System.in);
        double input1 = scan.nextDouble();
        System.out.println("put second floating point");
        double input2 = scan.nextDouble();
        System.out.println("Sum is " + (input1 + input2));
        System.out.println("Difference is " + (input1 - input2));
        System.out.println("Product is" + (input1 * input2));
    }
}
