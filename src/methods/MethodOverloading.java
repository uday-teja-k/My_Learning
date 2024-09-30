package methods;

public class MethodOverloading {

    static int max(byte x, byte y){
        return x>y?x:y;
    }


    static float max(float x, float y){
        return x>y?x:y;
    }
    static int max(int x, int y , int z){
        return x>y&&x>z?x:(y>z?y:z);
    }

    public static void main(String []args) {

        byte a= 10, b = 20;

        System.out.println(max(23, 24));
        System.out.println(max(a, b));

        //the above method is calling thee float method
        //float can also work for integer
        // if we want to use byte then we can do it in the above way.
// in method overloading only method name and method paramters have to be
        // different

    }


}
