package methods;

public class VarArgs {

    static String show(int...x){

    for (int a:x){
        System.out.println(x);
    }
    return "printed";
    }




    public static void main(String []args){

        System.out.println(show(10,20,20,45,34,23,53,34));

    }




}
