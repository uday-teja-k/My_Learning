package loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("enter number");
        Scanner scanner = new Scanner(System.in);
        number= scanner.nextInt();
        scanner.close();
        int m = number;
        int sum=0;
        int r;

        while(number>0){
            r=number%10;
            number=number/10;
            sum = sum + r*r*r;

        }
        if(sum==m){
            System.out.println("armstrong");
        }else{
            System.out.println("not arm");
        }
    }
}
