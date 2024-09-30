package constructors;

class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(){
        setLength(1);
        setBreadth(1);

    }
    public Rectangle(double l, double b){
        setLength(l);
        setBreadth(b);
    }
    public Rectangle(double s){
        length=breadth=s;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        if(l>=0) length=l;else length=0;
    }
    public void setBreadth(double b){
        if(b>=0) breadth=b;else breadth=0;
    }

    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth)return true;
        else return false;
    }


    //this rectangle class is complete now.
    //has properties first and then all type of constructors
    //getter and setter methods(property methods)
    //methods related to the class area perimeter...
    //called instance methods or called facilitators
    //a method which starts with "is" is called enquiry method


}
public class RectangleTest {
    public static void main(String [] args){

        Rectangle rectangle = new Rectangle(10,10);

        System.out.println("length is "+rectangle.getLength());
        System.out.println("breadth is "+rectangle.getBreadth());

        System.out.println("area is "+rectangle.area());
        System.out.println("perimeter is "+rectangle.perimeter());
        System.out.println("is it a square ? "+rectangle.isSquare());







    }





}
