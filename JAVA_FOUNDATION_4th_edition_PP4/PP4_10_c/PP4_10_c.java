package JAVA_FOUNDATION_4th_edition_PP4.PP4_10_c;

/**
 * Created by kaorihirata on 2017-04-27.
 */
public class PP4_10_c {
    public static void main(String[] args) {
        int row = 5;
        int X;
        int Y;

        for(Y=0;Y<row;Y++){
            for(X=row-Y;X<row;X++){
                System.out.print(" ");
            }
            for(X=0;X<row-Y;X++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
