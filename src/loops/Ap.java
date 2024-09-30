package loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        int a,d,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a= sc.nextInt();
        System.out.println("enter d");
        d= sc.nextInt();
        System.out.println("enter n");
        n= sc.nextInt();
        sc.close();
        int term=a;
        
        for(int i=1;i<=n;i++){
            System.out.print(term+",");
        term = term+d;
        }


         
    }
}
