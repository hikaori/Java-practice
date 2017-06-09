package Arraylist_add_object;

import java.util.ArrayList;

/**
 * Created by kaorihirata on 2017-06-09.
 */
public class Arraylist_add_object {
    public static void main(String[] args) {

        Fruit myfavorite1 = new Fruit("peach");
        Fruit myfavorite2 = new Fruit("mango");

        ArrayList<Fruit> myfruits = new ArrayList<>();
        myfruits.add(myfavorite1);
        myfruits.add(myfavorite2);

        System.out.println(myfruits);

        //============OUT PUT ==============//
        //         [peach,mango]
//                 * out put not String. address of the object.

    }

    public static class Fruit{
        String name;
        private Fruit(String name){
            this.name=name;
        }
    }
}
