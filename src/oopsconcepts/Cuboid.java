package oopsconcepts;

class CuboidOne {

    private double breadth;
    private double length;
    private double height;

    public double getBreadth(){
        return breadth;
    }
    public double getHeight(){
        return height;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double l){
        if(l>=0)
            length=l;
        else
            length=0;
    }
    public void setBreadth(double b){
        if(b>=0)
            breadth=b;
        else
            breadth=0;
    }

    public void setHeight(double h) {
        if(h>=0)
            height=h;
        else
            height=0;
    }

    public double volume(){
        return getLength()*getBreadth()*getHeight();
    }

    public double lsa(){
        return 2*(getLength()+getBreadth())*getHeight();
    }

    public double tsa(){
        return 2*((getLength()*getBreadth())+(getBreadth()*getHeight())+(getLength()*getHeight()));
    }


}

public class Cuboid{
    public static void main(String[] args){

        CuboidOne c1 = new CuboidOne();

        c1.setLength(9.2);
        c1.setBreadth(8.5);
        c1.setHeight(4.5);

        System.out.println("volume is "+c1.volume());
        System.out.println("lsa is "+c1.lsa());
        System.out.println("tsa is "+c1.tsa());
        System.out.println("length is "+c1.getLength());
        System.out.println("breadth is "+c1.getBreadth());
        System.out.println("height is "+c1.getHeight());


    }
}


