package Array_getIndex_getElement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> job = new ArrayList<>();
        job.add("web_designer");
        job.add("mobile_developer");
        job.add("system_engineer");
        job.add("soft_engineer");

        /// THE WAY TO GET INDEX NUMBER( .indexOf("element") )
        System.out.println(job.indexOf("web_designer"));
            // OUT PUT -->  0

        /// THE WAY TO GET ELEMENT OF ARRAY( .get("int") )
        System.out.println(job.get(1));
            // OUT PUT ---> mobile_developer
    }
}
