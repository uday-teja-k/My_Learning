package methods;

public class MethPrac {

    static int max(int x, int y){
        return x>y?x:y;
    }

    static String userName(String email){
        int a=email.indexOf('@');
        String name = email.substring(0,a);
        return name;
    }

    public static void main(String [] args){

        System.out.println(max(20,30));
        System.out.println(userName("AkkineniNagaChaitanya@yahoo.in"));
    }
}
