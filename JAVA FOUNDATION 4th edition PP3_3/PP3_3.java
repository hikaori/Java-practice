package com.company;

import java.util.Random;
import java.util.Scanner;

public class PP3_3 {

    public static void main(String[] args) {
	    String FN;
	    String LN;
		int FinalRandNum;

		Scanner scan = new Scanner(System.in);
		System.out.print("Whats your first name?");
		FN = scan.nextLine();

		System.out.print("Whats your last name?");
		LN = scan.nextLine();

		//create a Random Number object
		Random RandomNum = new Random();
		//Number object range from 10 to 99
		FinalRandNum = RandomNum.nextInt(88)+10;

	    System.out.print(FN.charAt(0)+LN.substring(0,5)+FinalRandNum);

    }
}
