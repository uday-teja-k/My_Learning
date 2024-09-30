package loops;

import java.util.Scanner;

public class CountDigits {  
    public static void main(String[] args) {

        int n,count=0;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        sc.close();
        while(n>0){
        n = n/10;
        count++;
        }
        if(count==1){
            System.out.println(count+" digit");}
            else{
                System.out.println(count+" digits");
            }

        
        

    }
}
