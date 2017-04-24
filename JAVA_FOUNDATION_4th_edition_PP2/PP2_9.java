package JAVA_FOUNDATION_4th_edition_PP2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-23.
 */
public class PP2_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much?");
        double totall = scan.nextDouble();

        int tenDoller = (int) totall / 10;
        double remainder = totall - tenDoller * 10;
        int fiveDoller = (int) remainder / 5;
        double remainder2 = remainder - fiveDoller * 5;
        int oneDoller = (int) remainder2 / 1;
        double remainder3 = remainder2 - oneDoller;

        double coinsDouble = remainder3 * 100;
        int coinsInt = (int) coinsDouble;

        int quarters = coinsInt / 25;
        int remainder4 = coinsInt - quarters * 25;
        int dimes = remainder4 / 10;
        int remainder5 = remainder4 - dimes * 10;
        int nickles = remainder5 / 5;
        int remainder6 = remainder5 - nickles * 5;


        System.out.println(tenDoller + "ten doller bills");
        System.out.println(fiveDoller + "fiveDoller bills");
        System.out.println(oneDoller + "oneDoller bills");
        System.out.println(quarters + "quarters");
        System.out.println(dimes + "dimes");
        System.out.println(nickles + "nickles");
        System.out.println(remainder6 + "pennies");


    }
}
