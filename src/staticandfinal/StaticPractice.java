package staticandfinal;

class Testu{
    static{
        System.out.println("block 1");
    }
    static{
        System.out.println("block 2");
    }
}



public class StaticPractice {
    public static void main(String[] args) {

        System.out.println("main");
        Testu testu = new Testu();
    }

}
