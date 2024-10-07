package methodoverriding;

class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super{
    @Override//here i can put the override annotation
    public void display(){
        System.out.println("Hello World");
    }
}
public class Test {
    public static void main(String[] args) {
        Super obj = new Super();
        obj.display();// hello

        Sub sub = new Sub();
        sub.display(); //hello world

        Super obj2 = new Sub(); //observe this line it is called dynamic methid dispatch
        //in the above line, super is reference, and sub is object
        //always methods are called upon objects and not on reference
        //super class, sub class unnapudu inka overrided method call chesinappudu, object ki method call avutundi not based on reference.
        //
        obj2.display(); //hello world


    }
}