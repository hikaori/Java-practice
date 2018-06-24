package while02;

/**
 * Created by kaorihirata on 2017-06-27.
 * 1+2+・・・と足していき、
    合計が100を越えた時点の合計値と、
    そのときに足した数を表示する
 */
public class while02 {
    public static void main(String[] args) {
        int sum=0;
        int count=1;
        while (sum<6){
            sum=sum+count;
            count++;
        }
        System.out.println("合計が100を越えた時点の合計値:"+sum);
        System.out.println("100を越えた時点に足した数 :"+(count-1));
    }
}
