package methods;

public class Method {

     int max(int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args){

        int a=10,b=100;
        Method method = new Method();
        System.out.println(method.max(a,b));

//there are 2 ways to call a method...1.to make the method static
// 2. is to create the object of the class and then call the method using the object











    }
}
