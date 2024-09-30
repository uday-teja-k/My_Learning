package newpack;

import java.util.Scanner;

public class Tweety {
    static int photosynthesis(int f, int g){
        return f-g;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
         System.out.println(photosynthesis(a,b));
    }
}