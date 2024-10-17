package methodoverriding;

class V{}
class D extends V{}

class Sup{
      protected void display(){   //allowed to make the method private
          System.out.println("Sup display");}
}
class Chil extends Sup{
    @Override
    protected void display(){//protected, public, private  is also allowed
        System.out.println("chil display");
    }
}

//in both methods signature must be exactly same
//if anything is different then it is not overriding, it will be a different method

public class OverridingRules {
    public static void main(String[] args) {
        Chil chil = new Chil();
        chil.display();


    }
}
