package NestedClass;

/**
 * Created by kaorihirata on 2017-05-25.
 */
public class ShadowTest {
    public int x = 0;

    class FirstLevel{
        public int x =1;

        void methodInFirstLevel(int x){
            System.out.println("x="+x);
            System.out.println("this.x="+this.x);
            System.out.println("ShadowTest.this.x="+ShadowTest.this.x);
        }
    }

    public static void main(String ...args){
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();//"NestedClass.ShadowTest"　on Auto supplement. means Firstlevel is nestedClass of ShadowTest
        fl.methodInFirstLevel(23);
    }
}


//////////////// out put //////////////////////
//        x = 23
//        this.x = 1
//        ShadowTest.this.x = 0