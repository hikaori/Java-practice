package while03;

/**
 * Created by kaorihirata on 2017-06-27.
 */
public class while03 {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        // 表示する。
        System.out.println();
        System.out.println("a = " + a + " , b = " + b);

        // 判定する。
        int r;
        while ((r = a % b) != 0) {
            a = b;
            b = r;
        }

        // 表示する。
        System.out.println("最大公約数 = " + b);
    }
}
