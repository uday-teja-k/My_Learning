package staticandfinal;

import java.util.Date;

public class Student {

    private String rollNo;
    private static int count = 1;

    //this method is used to generate roll number
    private String assignRollNo(){

        Date d = new Date();
        String rn = "Univ-" + (d.getYear()+ 1900 ) + "-" + count;
        //get year method is depricated, it is suggesting not to use it, will see
        count++;
        return rn;
    }


    public Student() {
        rollNo = assignRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }




}
