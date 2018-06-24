package while01;

public class while01 {
    /*
	1から100までの偶数の合計を表示する
	 */

    public static void main(String[] args) {
        System.out.println("11111");
        int Num=1;
	    int output=0;
	    while(Num<101){
	        if(Num%2==0){
	            output+=Num;
            }
            Num++;
        }
        System.out.println(output);
    }
}
