package loops;

import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        int n,rem;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        sc.close();
        

        while(n>0){
        rem = n%10;
        System.out.println(rem);
        n = n/10;
        }
        System.out.println(n);

        




    }
    
}
