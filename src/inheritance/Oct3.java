package inheritance;
//this vs super
class Rectangl{
    int length;
    int breadth;
    int x=10;

    Rectangl(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class Cubod extends Rectangl {
    int height;
    int x = 20;

    Cubod(int l, int b, int height) {
        super(l, b); //passing these both to super class
        this.height = height;   // using it in this class only
    }
    void display() {
        System.out.println("value of x in super class: "+super.x);
        System.out.println("value of x in the current object: "+this.x);
    }
}
public class Oct3 {
    public static void main(String[] args) {
        Cubod c1 = new Cubod(500, 300, 200);
        c1.display();
        System.out.println("length: "+c1.length);
        System.out.println("breadth: "+c1.breadth);
        System.out.println("height: "+c1.height);

        //c1 object will have

    }



}
