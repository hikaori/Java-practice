package JAVA_FOUNDATION_4th_edition_PP4.PP4_10_d;

/**
 * Created by kaorihirata on 2017-04-27.
 */
public class PP4_10_d {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<5-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i+1)*2-1; k++){ //* increase 1,3,5,... odd number..... n*2-1(in this case n-1 because start from 0)
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0; i<5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (5 - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
