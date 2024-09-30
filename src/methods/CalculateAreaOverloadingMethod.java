package methods;

public class CalculateAreaOverloadingMethod {


    static double area(double x, double y){
        return x*y;

    }
    static double area(double r){
        return Math.PI*r*r;

    }

    public static void main(String[] args){
        double l=10.5,b=20.5,r=7.14;
        System.out.println(area(l, b));
        System.out.println(area(r));
    }

}
