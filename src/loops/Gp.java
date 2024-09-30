package loops;

import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        

         int a,r,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a= sc.nextInt();
        System.out.println("enter r");
        r= sc.nextInt();
        System.out.println("enter n");
        n= sc.nextInt();
        sc.close();
        int term=a;
        
        for(int i=0;i<n;i++){
            System.out.print(term+",");
        term = term*r;
        
        }
    }
}
