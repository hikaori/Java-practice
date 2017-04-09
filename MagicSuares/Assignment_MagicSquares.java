/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_magicsquares;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hiratakaori
 */
public class Assignment_MagicSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//        
//        String[] first_row = input.split("");   
//        for (int i=0; i<first_row.length; i++){
//                System.out.println("first_row" + i + "is" +first_row[i]);
//            }
//        //change data type from string data to int data 
//        int[] firstRowNum = new int[first_row.length];
//                for (int j=0; j < first_row.length; j++){
//                    firstRowNum[j] = Integer.parseInt(first_row[j]);
//                    System.out.println(firstRowNum[j]);
//                } 
//        
//        //Calculate sum of Row
//        int sum = 0;        
//        for (int j=0; j < first_row.length; j++){
//                    sum += firstRowNum[j];           
//        }
//            System.out.println(sum);

        MagicSuares_methods ROW01 = new MagicSuares_methods();
        System.out.println(ROW01.ROW());
        int Row01 = ROW01.ROW();
        
        MagicSuares_methods ROW02 = new MagicSuares_methods();
        System.out.println(ROW02.ROW());
//        int Row02 = ROW02.ROW();
        
//        int A = ROW01.ROW();
//        int B = ROW02.ROW();
//        System.out.println(B);
//        if (A == B){
//            System.out.println("this is MagicSuares");
//            }
//        else{
//            System.out.println("this is Not MagicSuares");
//            }
        
    }

    
}
