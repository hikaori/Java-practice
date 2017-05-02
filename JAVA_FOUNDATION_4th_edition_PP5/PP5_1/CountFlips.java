package JAVA_FOUNDATION_4th_edition_PP5.PP5_1;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class CountFlips {
    //------------------------------------
    //Flips a coin multiple times and counts the number of heads
    //and tails that result.
    //------------------------------------

    public static void main(String[] args)
    {
        final int FLIPS = 1000;
        int heads = 0, tails =0;

        Coin myCoin = new Coin();

        for (int count=1; count <= FLIPS; count++)
        {
            myCoin.flip();

            if (myCoin.isHeads())
                heads++;
            else
                tails++;
        }
        System.out.println("Number of flios:" +FLIPS);
        System.out.println("Number of heads:" +heads);
        System.out.println("Number of tails:" +tails);
    }
}
