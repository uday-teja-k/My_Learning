package abstractexample;

abstract class KFC{
    KFC(){}  //concrete constructor
    void makeItem(){}   //concrete method
    abstract void billing();// abstract billing it is upto the franchise
    abstract void offers();//abstract offer to give - depends on franchise

}
class MyKFC extends KFC{
    MyKFC(){}

    void billing(){}
    void offers(){}


    void festiveOffers(){}





}
public class Chicken {
    public static void main(String[] args) {
        KFC kfc = new MyKFC();
        //I can use the reference of the class but not the object.
        //object can only be created for the subclass...


    }
}
