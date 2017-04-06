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

//textbook5_6 part2

public class Boxtest {
    public static void main(String[] args){
        Box b1 = new Box(100,100,100);
        b1.getDepth();
        b1.setDepth(50);
        b1.getDepth();
        b1.setFull(true);

        System.out.println(b1);

        
    }
}


