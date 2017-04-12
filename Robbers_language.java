package com.company;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Robbers_language {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String outputword ="";

        //------------------------------------------------------------------------------------//
        // cleat Alphabet Array. the String data change to Array list.
        // Because later want to use 'String.valueOf'.
        // 'String.valueOf' only use for String or Array list.
        //------------------------------------------------------------------------------------//
        String[] Alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "x", "y", "z"};

        List<String> AlphabetList = Arrays.asList(Alphabet);
//        ☆System.out.println(AlphabetList());

        //------------------------------------------------------------------------------------//
        //  repeat same operator　input character amount.
        //  also change the character type to String using 'String.valueOf'.
        //  after repeat ,print out"outputword".
        //------------------------------------------------------------------------------------//
        for (int i = 0; i < input.length(); i++) {
            String OneLetter = String.valueOf(input.charAt(i));
//            ☆System.out.println("OneLetter = " + OneLetter);

            //------------------------------------------------------------------------------------//
            //  if the character is vowel put in 'outputword'.
            //  if not vowel ,get the position the character in AlphabetList then
            //  put the character and closest vowel(the first and second character of the character)
            // in 'outputword'.
            //------------------------------------------------------------------------------------//

            if (OneLetter.equals("a")|| OneLetter.equals("e")|| OneLetter.equals("i") || OneLetter.equals("o") || OneLetter.equals("u")){
                outputword += OneLetter;
            }else{
                int count01 = AlphabetList.indexOf(OneLetter);
//                ☆System.out.println("count01="+count01);

                if (count01 < 3) {
                    outputword += OneLetter + "a";
                } else if (2 < count01 && count01 < 7) {
                    outputword += OneLetter + "e";
                } else if (6 < count01 && count01 < 12) {
                    outputword += OneLetter + "i";
                } else if (11 < count01 && count01 < 18) {
                    outputword += OneLetter + "o";
                } else
                    {outputword += OneLetter + "u";}

                //------------------------------------------------------------------------------------//
                //  for create the third word of the character , plus one with the first character position.
                //  then the third word is vowel,put the next word of the closest vowel in 'outputword'.
                //  if the third word is not vowel, put third word in 'outputword'.
                //------------------------------------------------------------------------------------//
                String OneLetter3ed = AlphabetList.get(count01+1);
                if (OneLetter3ed.equals("a") || OneLetter3ed .equals("e") || OneLetter3ed .equals("i") || OneLetter3ed .equals("o") || OneLetter3ed .equals("u")) {
                    outputword += AlphabetList.get(count01+2);
                } else {
                    outputword += AlphabetList.get(count01+1);
                }
            }
        }
        System.out.println(outputword);
    }
}






