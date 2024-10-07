package methodoverriding;

class Parent{
    public void meth1(){System.out.println("Parent.meth1");}
    public void meth2(){System.out.println("Parent.meth2");}
}
class Child extends Parent{
    @Override
    public void meth2(){System.out.println("Child.meth2");}
    public void meth3(){System.out.println("Child.meth3");}
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        parent.meth1();
//        parent.meth2();

        Child c = new Child();
//        c.meth1();
//        c.meth2();
//        c.meth3();

        Parent p = new Child();
        p.meth1();
        p.meth2();
        //super class is only having 2 methods so...
        //p.meth3//meth3 not possible

        //Child c2 = new Parent(); this is not allowed



    }
}
