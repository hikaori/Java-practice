package JAVA_FOUNDATION_4th_edition_PP4.PP4_10_b;

/**
 * Created by kaorihirata on 2017-04-27.
 */
public class PP4_10_b {
    public static void main(String[] args) {
        int x,y;
        int row=10;
        for(y=0;y<row;y++){
            for(x=0;x<row-y-1;x++){
                System.out.print(" ");
            }
            for(x=row-y-1;x<row;x++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
