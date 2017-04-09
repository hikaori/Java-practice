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
public class MagicSuares_methods {
    public MagicSuares_methods(){
         int j=0;   
    }
    
    public int ROW(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        String[] first_row = input.split("");   
        for (int i=0; i<first_row.length; i++){
//                ☆System.out.println("first_row" + i + "is" +first_row[i]);
            }
        //================================================
        //change data type from string data to int data 
        //================================================
        int[] firstRowNum = new int[first_row.length];
                for (int j=0; j < first_row.length; j++){
                    firstRowNum[j] = Integer.parseInt(first_row[j]);
//                    ☆System.out.println(firstRowNum[j]);
                }
                
        //================================================        
        //Calculate sum of Row
        //================================================
        int sum = 0;        
        for (int j=0; j < first_row.length; j++){
                    sum += firstRowNum[j];           
        }
//        ☆System.out.println(sum);
        return sum;
    
    }

}
        
    

