package abstractexample;

abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();

}

class MyHospital extends Hospital{
    MyHospital(){}
    void emergency(){}
    void appointment(){}
    void admit(){}
    void billing(){}


    //all the methods of superclass must be overrided
}




public class Example {
    public static void main(String[] args) {
        Hospital hospital = new MyHospital();
        hospital.emergency();
        hospital.appointment();
    }
}
