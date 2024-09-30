package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
/* 
        int a=0,n;
        int b=1,c;
        System.out.println("enter the number of terms");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        sc.close();
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
*/

        int a=0,b=1,c,n;
        System.out.println("enter the number of terms");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }


        
        


       
        




    }
    
}
