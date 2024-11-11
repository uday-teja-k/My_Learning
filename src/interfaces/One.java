package interfaces;

interface Test{
    void meth1();
    void meth2();
}
class My implements Test{
    public void meth1() {System.out.println("meth1 of class My");}
    public void meth2() {System.out.println("meth2 of class My");}
    public void meth3() {System.out.println("meth3 of class My");}
}
public class One
{
    public static void main(String [] args){
        Test t = new My();
        t.meth1();
        t.meth2();
//        t.meth3();
        //test is like parent class for my
        //the methods of class My will be called
        //we are achieving runtime polymorphism using interfaces
        //interfaces are only meant for overriding,. i.e for runtime polymorphsim




    }
}
