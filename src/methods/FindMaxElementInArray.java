package methods;

public class FindMaxElementInArray {


    static int max1(int x){
        return ++x ;

    }

    static int max(int X[]){
        int max=X[0];
        for(int i=0; i<X.length;i++) {
            if (X[i] >max) max = X[i];
        }
    return max;
    }
    public static void main(String[] args){
        int c = 14, d=45;
        int A[] = {9,2,3,4,1};
       System.out.println(max(A));
       System.out.println(max1(c));
       System.out.println(c);



}
}