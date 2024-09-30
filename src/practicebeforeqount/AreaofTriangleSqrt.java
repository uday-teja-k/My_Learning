package practicebeforeqount;

import java.util.Scanner;

public class AreaofTriangleSqrt {


        public static void main(String args[]){

            float a,b,c,d;
            double area;
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a");
            a = scanner.nextFloat();

            System.out.println("enter b");
            b = scanner.nextFloat();

            System.out.println("enter c");
            c = scanner.nextFloat();


            d = (a+b+c)/2f;
            area = Math.sqrt(d*(d-a)*(d-b)*(d-c));


            System.out.println("area is "+ area);




        }
    }



