package innerclasses;

abstract class Muyy {
    abstract public void show();
}

interface Moooot {
    public void mootMethod();
}

class Outerrrr {
    public void display() {
        Muyy mm = new Muyy() {
            public void show() {
                System.out.println("Hello");
            }
        };
        mm.show();

        new Muyy() {
            public void show() {
                System.out.println("Helooo");
            }
        }.show();
//the above line is another shortcut
        new Moooot() {
            public void mootMethod() {
                System.out.println("mootMethod meth from interface");
            }
        }.mootMethod();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        Outerrrr ouu = new Outerrrr();
        ouu.display();
    }
}