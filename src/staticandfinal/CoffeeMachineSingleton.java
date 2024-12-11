package staticandfinal;

public class CoffeeMachineSingleton {
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    static private CoffeeMachineSingleton my=null;
    //this is ensure that only one object is created, not more than that

     private CoffeeMachineSingleton(){
        coffeeQty=10;
        waterQty=10;
        milkQty=10;
        sugarQty=10;
    }
    public void fillWater(float qty){
         waterQty=qty;
    }
    public void addSugar(float qty){
         sugarQty=qty;
    }
    public float getCoffee(){
         return 0.23f;
    }

    static CoffeeMachineSingleton getInstance(){
         if (my==null)
             my = new CoffeeMachineSingleton();
          return my;
         }
}

//if it is a static method then it is easy to call the method from outside the class.


    //if constructor is public then
    //if we make the constructor private then we cannot create object for that
    //we can call static methods

    //a constructor is made as private so that we cannot create an object
    //this class is an example of singleton class

