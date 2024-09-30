package loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();
        sc.close();
        int m = n;
        int rem=0,rev=0;

        while(n>0){

            rem = n%10;
            rev = rev*10+rem;
            // System.out.println(rev);
            n=n/10;
                }
        System.out.println(rev);
        if(rev==m){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
