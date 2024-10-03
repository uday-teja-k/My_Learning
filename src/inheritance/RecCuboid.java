package inheritance;


class Rectangle{
        int length;
        int breadth;

    Rectangle() {
        length = breadth = 1;
    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


}

class Cuboid extends Rectangle{
    int height;

    Cuboid(){
        height = 1;
    }
    Cuboid(int height){
        this.height = height;
    }
    Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;

    }
    int volume(){
        return length*breadth*height;
    }


}
public class RecCuboid {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5,3,10);
        System.out.println(cuboid.volume());
    }

}
