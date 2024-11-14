package staticandfinal;

class Test{
    static int x =10;
           int y =20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){

        System.out.println(x);
       // System.out.println(y);// static methods cannot access non-static members of the class
    }
}

public class ExampleOne{
    public static void main(String[]args){
        Test t1 = new Test();
        t1.show();
        t1.x=30;//x is static member have only one copy so it will be modified
        t1.y=50;//y is not static so it will not change


        Test t2 = new Test();
        t2.show();



    }



}