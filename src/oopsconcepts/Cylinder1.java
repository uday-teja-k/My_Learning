package oopsconcepts;

import practicebeforeqount.AreaofTriangleSqrt;

public class Cylinder1 {

    public float radius;
    public float height;

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
