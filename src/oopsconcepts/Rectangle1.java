package oopsconcepts;
class Rect{

    private double length;
    private double breadth;

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
}

public class Rectangle1{
    public static void main(String [] args){

        Rect r = new Rect();

        r.setLength(-10.5);
        r.setBreadth(6.5);

        System.out.println("area is "+r.area());
        System.out.println("perimeter is "+r.perimeter());
        System.out.println("is it a square ? "+r.isSquare());
        System.out.println("length is "+r.getLength());
        System.out.println("breadth is "+r.getBreadth());

    }
}
