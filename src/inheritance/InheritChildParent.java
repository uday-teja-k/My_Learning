package inheritance;

class Parent{

    public Parent(){
        System.out.println("non param parent");
    }
    public Parent(int x){
        System.out.println("param parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("non param Child");
    }
    public Child(int y){
        System.out.println("param child");
    }

}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}
//three levels of classes
public class InheritChildParent {
    public static void main(String []args){

//        Child  child   = new Child();    //run  it and see behaviour
        //in the above line, it first goes to parent constructor, then child

        //when you create an object of a child class then the constructor of the parent class is executed first.
//        Parent parent  = new Parent();
        GrandChild grandChild = new GrandChild(); //parent->child->grandchild

        //constructors are executed top to bottom, parent then child


    }

}
