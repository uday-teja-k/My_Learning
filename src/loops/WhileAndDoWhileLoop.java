package loops;

import java.util.Scanner;

public class WhileAndDoWhileLoop {
    public static void main(String[]args)
    {
        
        
        /*
        int i=1,n=100;
        
        while(i<n){
            System.out.println(i);
            i=i*2;
        }
        System.out.println("-------------------------------------");

        
        
        int i1=1,n1=100;
        do{
            System.out.println(i1);
            i1=i1*2;
            
        }while(i1<n1);
        
        */
        
    
        /* 

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for which you need multiplication table");
        n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
           */

           int n,sum=0;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number");
           n=sc.nextInt();
           sc.close();

           for(int i=1;i<=n;i++){
            sum = sum+i;
           }
           System.out.println("Sum of "+n+" number is "+sum);


            



           

            




        

        

        








            
    }
    
}
