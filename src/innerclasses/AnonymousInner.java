package innerclasses;

interface Me {
    void display();
}

abstract class Mr {
    abstract void display2();
}

class Outer1 {
    public void meth() {
        Me m = new Me() {
            public void display() {
                System.out.println("display");
            }
        };// the above 4 lines we have defined the class which is anonymous
        m.display();
        Mr mr = new Mr() {
            public void display2() {
                System.out.println("display2");
            }
        }; //the above 4 lines we have defined the class which is anonymous
        mr.display2();
    }
}

public class AnonymousInner {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.meth();
    }
}
