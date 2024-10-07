package methodoverriding;


class TV{
    public void switchON(){System.out.println("TV is switched on");}
    public void changeChannel(){System.out.println("tv channel changed");}
}
class SmartTV extends TV{
    @Override
    public void switchON(){System.out.println("Smart TV is switched on");}
    @Override
    public void changeChannel(){System.out.println("Smart tv channel changed");}
    public void browse(){System.out.println("Smart tv browse");}
}

public class Overriding {
    public static void main(String[] args) {
//        TV tv = new TV();
//        tv.switchON();
//        tv.changeChannel();

        TV stv = new SmartTV();
        stv.switchON();
        stv.changeChannel();
//        stv.browse();
        //object is of smart tv so smart tv is called



    }
}
