package JAVA_FOUNDATION_4th_edition_PP5.PP5_5;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public int computeAge() {
        return this.age * 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " is a dog and " + this.age + " years old";
    }
}
