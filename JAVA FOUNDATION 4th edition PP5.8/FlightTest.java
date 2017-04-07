/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbook;

/**
 *
 * @author hiratakaori
 */
public class FlightTest {
    public static void main(String[] agrs){
        Flight f1 = new Flight("Delta", "Vancouver", "Calgary", 1234);
        Flight f2 = new Flight("ANA", "Tokyo", "Osaka", 1389);
        System.out.println(f1);
        System.out.println(f2);
//        int a = 10;
    }
    
}
