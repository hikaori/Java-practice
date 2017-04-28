package JAVA_FOUNDATION_4th_edition_PP3.PP3_3;

import java.util.Random;

/**
 * Created by kaorihirata on 2017-04-25.
 */
public class PhoneNumber {

    private int first_three;
    private int second_three;
    private int last_four;

    public PhoneNumber() {
        Random randomN = new Random();
//        first_three = ((int) Math.random() * 899) + 100;
        first_three = ((int) Math.random() * 777) + 100;
        second_three = randomN.nextInt(257) + 742;
        last_four = randomN.nextInt(8999) + 1000;
    }

    @Override
    public String toString() {
        return Integer.toString(first_three) + "-" + Integer.toString(second_three) + "-" + Integer.toString(last_four);
    }

    public static void main(String[] args) {
        PhoneNumber a = new PhoneNumber();
        System.out.println(a);
    }
}
