package inheritance;

class Parent3
{
    Parent3()
    {
        System.out.println("Non-Param of parent");
    }
    Parent3(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child3 extends Parent
{
    Child3()
    {
        System.out.println("Non-Param of child");
    }
    Child3(int y)
    {
        System.out.println("Param of child");
    }
    Child3(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child c=new Child();
        //Child c=new Child(20);
        Child3 c=new Child3(10,20);
    }

}
