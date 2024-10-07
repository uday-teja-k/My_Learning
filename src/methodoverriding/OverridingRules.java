package methodoverriding;

class Sup{
    public void display(){
        System.out.println("Sup display");
    }
}
class chil extends Sub{
    @Override
    public void display(){
        System.out.println("chil display");
    }
}

//in both methods signature must be exactly same
//if anything is different then it is not overriding, it will be a different method

public class OverridingRules {
    public static void main(String[] args) {

    }
}
