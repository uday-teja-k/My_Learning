package interfaces;

interface Sample{
    final static int C=10;
    public abstract void meth1();
    public abstract void meth2();
    private void meth3(){
        System.out.println("Meth3 of Sample");
    }
}
interface Sample2 extends Sample{
    void meth4();
}
class Moo implements Sample2{
    public void meth4() {}
    public void meth1() {}
    public void meth2() {}

}

public class InterfaceDosAndDonts {
    public static void main(String [] args){
        System.out.println(Sample.C);
        //interface lo variable ni static ani declare chesamu kabatti, we can access it
        //using the interface name and dot operator
        //Sample.meth3();// now that we have decalrede it default we cannot call it ina a static way

        Moo m = new Moo();
//        m.meth3();
        //

    }
}

//from java 8 onwards default methods are also allowed inside interface
//changing static method to default
