package interfaces;
class Phone{
    public void call(){System.out.println("phone call");}
    public void sms(){System.out.println("phone sending SMS");}
}
interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){System.out.println("Smart Phone video calling");}
    public void click(){System.out.println("smart phone clicking photo");}
    public void record(){System.out.println("smart phone recording video");}
    public void play(){System.out.println("smart phone playing music");}
    public void stop(){System.out.println("smart phone stopping music ");}
}
public class InterfaceExample {
    public static void main(String [] args){
        IMusicPlayer s = new SmartPhone();
//        s.call();
//        s.sms();
//        s.videoCall();
        s.play();
        s.stop();
//        s.click();
//        s.record();
        //when i create a reference of Phone, then i can only call methods
        // which are present in Phone

        //object is the same but we are using different references, beauty of oops

        //just like real life
        //






    }
}