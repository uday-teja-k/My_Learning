package loops;

import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();
        sc.close();
      
        int rem=0,rev=0;

        while(n>0){

            rem = n%10;
            rev = rev*10+rem;
            // System.out.println(rev);
            n=n/10;
                }
        System.out.println(rev);
        
    }
}
