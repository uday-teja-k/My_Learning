package inheritance;

//parameterized constructors in inheritance

class Parent1{

    Parent1(){
        System.out.println("non param parent");
    }
    Parent1(int x){
        System.out.println("param parent "+x);
    }
}

class Child1 extends Parent{
    Child1(){
        System.out.println("non param Child");
    }
    Child1(int y){
        System.out.println("param child "+y);
    }
    Child1(int x, int y){//one of the param is for super class

        super(x);
        System.out.println("2 param of child "+y);
        //the first line should be super (x)
        //so this will call the super class constructor
        //super is a keyword which refers to super class
        //when we are passing a parameter means we are calling the param constructor
        //super class param cons ni call cheyalante child class first line lo super ani ivvalsinde
        // parent constructor must be called in the first line of the child constructor
    }

}

public class SuperCons {
    public static void main(String [] args){
//        Parent1 p1 = new Parent1();
        //above line ki o/p will be non param parent

//        Parent1 p2 = new Parent1(10);
        //above line ki o/p will be param parent 10

//        Child1 child1 = new Child1();
        //above statement gives non param parent and non param child

//        Child1 child2 = new Child1(300);
        //above statement gives non param parent and param child 300

        Child1 child3 = new Child1(400,600);
        //above statement will give param parent 400 and 2 param of child 400 600
        //super bracket lo eh parameter ayina pettochu,

        //400 will go to parent class and 600 will be used by child class


    }



}
