package JAVA_FOUNDATION_4th_edition_PP5.PP5_5;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class Kennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", 10);
        System.out.println(dog1.computeAge());
        dog1.setAge(dog1.computeAge());
        System.out.println(dog1);

    }

}
