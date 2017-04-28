package JAVA_FOUNDATION_4th_edition_PP3.PP3_3;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by kaorihirata on 2017-04-24.
 */
public class PP3_3myselfe {
    public static void main(String[] args) {
        DecimalFormat tellformat = new DecimalFormat("###,###,###");
        Random randomN = new Random();

//        int firstN1 = randomN.nextInt(8);
//        int firstN2 = randomN.nextInt();
//        int firstN3 = randomN.nextInt(10);
//
//        int secondN = randomN.nextInt(266);
//        int thirdN = randomN.nextInt(1000);
//
//        // change   int →　string
//        String sFirstN1 = Integer.toString(firstN1);
//        String sFirstN2 = Integer.toString(firstN2);
//        String sFirstN3 = Integer.toString(firstN3);
//
//        String sSecondN = Integer.toString(secondN);
//        String sThirdN = Integer.toString(thirdN);
//
//        String tell = sFirstN1 + sFirstN2 + sFirstN3 + sSecondN + sThirdN;
        String tell = "123456789";
        System.out.println(tell);

        // change   string →　int
        int intTell = Integer.parseInt(tell);
        System.out.println(intTell);

        System.out.println(tellformat.format(intTell));

    }
}
//question 1.somehow I cant use format... why?