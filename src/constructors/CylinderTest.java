package constructors;

class Cylinder{

    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public void setRadius(int r) {
        if(r>=0)radius = r; else radius=0;
    }
    public void setHeight(int h) {
       if(h>=0)height = h; else height=0;
    }
    public void setDimensions(int r, int h){
        radius=r;
        height =h;
    }
    public Cylinder(){
        setRadius(1);
        setHeight(1);
    }
    public Cylinder(int r){
        setRadius(1);
    }
    public Cylinder(int r, int h){
        radius=r;
        height=h;
    }
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double tsa(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height;
    }
}
public class CylinderTest {
    public static void main (String [] args){


        Cylinder cylinder = new Cylinder(20,30);

        Cylinder cylinder1 = new Cylinder();

        System.out.println(cylinder1.getRadius());  //1



        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.tsa());


    }
}
