package inheritance;

 class Circle1 {

    private double radius;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius= radius;
    }


    public Circle1(){
        radius=0.0;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Cylinder1 extends Circle1{

    //cylinder is an extension of a circle
    private double height;

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public Cylinder1(){
        height=0.0;
    }
    public double volume(){
        return area()*height;
    }

}
public class Circle{
     public static void main(String[] args){

         Cylinder1 c1 = new Cylinder1();
         c1.setRadius(7.0);
         c1.setHeight(10.0);

         System.out.println("vol: "+c1.volume());
         System.out.println("area: "+c1.area());
         //here when we write c1.area

     }
}


