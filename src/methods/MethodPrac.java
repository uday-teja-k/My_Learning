package methods;
public class MethodPrac {
    static void change(int X[],int index,int value){
        X[index]=value;
    }
    static void change2(int x,int value){
        x=value;
    }
    public static void main(String[] args){
        int A[]={2,4,6,8,10};
        change(A,4,20);
        for(int x:A){
            System.out.println(x);
        }
        int x=10;
        change2(x,33);
        System.out.println("");
        System.out.println("value of primitive datatype: "+x);





    }
}
