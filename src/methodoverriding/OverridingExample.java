package methodoverriding;
class Car{
    public void start(){System.out.println("Car started");}
    public void accelerate(){System.out.println("Car is accelerated");}
    public void changeGear(){System.out.println("Car gear changed");}
}
class LuxuryCar extends Car{
    public void changeGear(){System.out.println("Automatic gear");}
    public void openRoof(){System.out.println("Sunroof opened");}
}

public class OverridingExample {
    public static void main(String[] args) {
        Car car = new LuxuryCar();
        car.start();
        car.accelerate();
        car.changeGear();
//        car.openRoof();
    }
}
