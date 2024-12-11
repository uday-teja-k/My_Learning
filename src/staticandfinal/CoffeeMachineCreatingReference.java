package staticandfinal;

public class CoffeeMachineCreatingReference {
    public static void main(String args[]) {


        CoffeeMachineSingleton c1 = CoffeeMachineSingleton.getInstance();
        CoffeeMachineSingleton c2 = CoffeeMachineSingleton.getInstance();
        CoffeeMachineSingleton c3 = CoffeeMachineSingleton.getInstance();

        System.out.println(c1+" "+c2+ " "+c3);
        if(c1 == c2 && c2 == c3){
            System.out.println("Same");
        }//they are same
        //some times it will be useful
        //if we want fixed no. of objects to be created then we can make
        //use of singleton, use counter, refer video
        
        
        //all the references will be same
        //if different objects are created references will not be same
        //all the references are holding the same object so they will be same


    }//static is very useful

    //



}
