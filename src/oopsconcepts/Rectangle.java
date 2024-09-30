package oopsconcepts;

public class Rectangle {


    public float length;
    public float breadth;


    public float area(){
        return length*breadth;
    }

    public float perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
























//    public int length;
//    public int breadth;
//
//    public int area()
//    {
//
//    }
//    public int perimeter()
//    {
//
//    }
}
