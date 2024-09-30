package practicebeforeqount;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String args[]){

        float base,height,area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter base");
        base = scanner.nextFloat();

        System.out.println("enter height");
        height = scanner.nextFloat();

        area = (base * height)/2;

        System.out.println("area of triangle is: "+ area);

    }


}
