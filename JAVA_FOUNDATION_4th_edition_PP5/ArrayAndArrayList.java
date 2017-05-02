package JAVA_FOUNDATION_4th_edition_PP5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-04-29.
 */
public class ArrayAndArrayList {
    public static void main(String[] args) {

        int[] my_array = new int[10];
        System.out.println(Arrays.toString(my_array));

        int[] my_array1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(my_array1));

        for(int i = 0; i < my_array.length; i++){
            if (my_array[i] == 3) {
                // do something
            }
            System.out.println(my_array[i]);
        }

        System.out.println("=========");

        for (int i : my_array) {
            if (i == 3){
                // do something
            }
            System.out.println(i);
        }

        System.out.println("=========");

        ArrayList<String> my_arr_list = new ArrayList<>();
        my_arr_list.add("A");
        my_arr_list.add("B");
//        my_arr_list.remove("A");

        System.out.println(my_arr_list.size());

    }

}
