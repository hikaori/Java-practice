package Try_Catch_Trow;

/**
 * Created by kaorihirata on 2017-06-08.
 */
public class Try_Catch_Trow {
    public class Main {
        public static void main(String[] args) {
            Example2();
        }
    }
//    =====================
//    BASE (try catch)
//    ---------------------
//      try
//      {
//        //statements that may cause an exception
//         throwsSample(fileName);
//      }
//      catch(exception(type) e(object))‏
//      {
//        //error handling code
//      }

        public static void throwsSample(String fileName) throws FileNotFoundException {
            FileReader r = new FileReader(fileName);
            System.out.println(fileName + "を読み込みました");
        }
//     ---------------------
    private static void Example2(){

    }

}
