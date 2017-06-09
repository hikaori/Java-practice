package Try_Catch;

public class Main {
    public static void main(String[] args) {
        Example1();
    }

//    =====================
//    BASE (try catch)
//    ---------------------
//      try
//      {
//        //statements that may cause an exception
//                 - if caused an exception dosen't execute.
//                 - catch statement will execute.
//      }
//      catch(exception(type) e(object))‏
//      {
//        //error handling code
//      }
//     ---------------------

    //
    private static void Example1(){
        int num1, num2;
        try {
            // Try block to handle code that may cause exception
            num1 = 0;
            num2 = 62 / num1;  // will be error
            System.out.println("Try block message");
        } catch (ArithmeticException e) {
            // This block is to catch divide-by-zero error
            System.out.println("Error: Don't divide a number by zero");
        }
        System.out.println("I'm out of try-catch block in Java.");
    }
//     --------------------- OUT PUT  ---------------------
//    Error: Don't divide a number by zero
//    I'm out of try-catch block in Java.

}
