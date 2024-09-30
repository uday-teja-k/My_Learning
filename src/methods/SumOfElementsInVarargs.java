package methods;

public class SumOfElementsInVarargs {

    static int sum(int...A){
        int sum=0;
        for(int x:A){
            sum= sum+x;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum(20,30,100));
    }
}
