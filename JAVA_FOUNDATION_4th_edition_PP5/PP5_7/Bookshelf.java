package JAVA_FOUNDATION_4th_edition_PP5.PP5_7;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class Bookshelf {
    public static void main(String[] args) {
        Book A = new Book("totoro","miyazakihayao","giburi",1970);
        System.out.println(A);
        System.out.println(A.getTitle());
        A.setTitle("kiminonawa");
        System.out.println(A.getTitle());
    }
}
