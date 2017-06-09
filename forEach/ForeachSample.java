package forEach;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaorihirata on 2017-05-08.
 *
 * 参考
 * http://www.sejuku.net/blog/22232
 */
public class ForeachSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");


        for(String s : list){               //for (型 変数名 : コレクション名){
            System.out.println(s);          // 繰り返し行う処理
        }                                   // }


//        list.forEach(s -> System.out.println(s));   //   コレクション名.forEach(引数 -> 繰り返し行う処理)


        int[] arraySample = new int[8]; //array のobject をどうやってfor eachで呼ぶか試した。
        for(int g:arraySample);   // 正しくは、for(int g:arraySample);

    }
}
