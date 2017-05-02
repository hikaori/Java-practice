package JAVA_FOUNDATION_4th_edition_PP5.PP5_1;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class Coin {
    private final int HEADS = 0; //tail is 1
    private int face; //current side showing

    //------------------------------------
    // set uo this coin by flipping it initially.
    //------------------------------------
    public Coin(){
        flip();
    }

    //------------------------------------
    //Flips this coin by randomly choosing a face value.
    //------------------------------------
    public void flip(){
        face = (int) (Math.random()*2);
    }

    //------------------------------------
    // Return true if the current face of this coin is heads
    //------------------------------------
    public boolean isHeads(){
        return (face == HEADS);
    }

    //------------------------------------
    //Returns the current face of this coin as a string
    //------------------------------------
    public String toString(){
        return (face==HEADS)? "Heads" : "Tails";
    }
}
