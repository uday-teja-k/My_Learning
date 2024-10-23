package abstractexample;

abstract class Shapes {
    abstract public double perimeter();
    abstract public double area();}

 class Circle extends Shapes{
     double radius;
     public double perimeter(){
         return 2*Math.PI*radius;
     }
     public double area(){
         return Math.PI*radius*radius;
     }
}
class Rectangle extends Shapes{
    public double length;
    public double breadth;
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}

public class Shape{
    public static void main(String []args){

        Rectangle r = new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Circle c = new Circle();
        c.radius = 10;
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Shapes r1 =c;
        System.out.println(r1.perimeter());



    }
}
