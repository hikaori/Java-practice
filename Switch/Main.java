package Switch;

import java.util.ArrayList;

/**
 * Created by kaorihirata on 2017-06-12.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> job = new ArrayList<>();
        job.add("web_designer");
        job.add("mobile_developer");
        job.add("system_engineer");
        job.add("soft_engineer");

        chackJob(job.(1));
    }


    ///   USING "IF / ELSE IF " VAR
//    public static void chackJob(String job) {
//        if(job =="web_designer"){
//            System.out.println("index 1 = web_designer");
//        }
//        else if(job =="soft_engineer"){
//            System.out.println("index 1 = soft_engineer");
//        }
//        else if(job =="mobile_developer"){
//            System.out.println("index 1 = mobile_developer");
//        }
//    }

    ///   USING "SWITCH " VAR
    public static void chackJob(String job){
        switch (job){
        case "web_designer":
            System.out.println("index 1 = web_designer");
            break;
        case "soft_engineer":
            System.out.println("index 1 = soft_engineer");
            break;
        case "mobile_developer":
            System.out.println("index 1 = mobile_developer");
        }
    }

    // OUT PUT(BOTH IF/ELSE IF AND SWITCH) -----> index 1 = mobile_developer

}
