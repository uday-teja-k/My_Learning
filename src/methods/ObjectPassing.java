package methods;

public class ObjectPassing {
    static void change(int D[], int index, int value){
        D[index]= value;
    }
    static void change1(int D[], int index, int value){
        D[index]= value;
    }
    static void change2(int x, int value){
        x= value;
        System.out.println(x);
    }
    public static void main(String[] args){
        int A[] ={23,24,25,26,27};
        change(A,3,88);
        change1(A,2,43);


        for(int x:A){
            System.out.println(x);
        }
        System.out.println(A[3]);
        int D= 111;
        change2(D,333);
        System.out.println(D);
    }
}
