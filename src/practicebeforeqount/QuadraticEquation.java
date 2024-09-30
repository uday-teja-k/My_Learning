package practicebeforeqount;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[]) {

        int a, b, c;
        double r1, r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();


        r1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
        r2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
        System.out.println("r1 is " + r1);
        System.out.println("r2 is " + r2);

    }
}