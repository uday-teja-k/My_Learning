package arrays;

public class ReverseArray {
    public static void main(String [] args){

        int A[] = new int[5];
        // System.out.println(A.length);
        int B[] = {1,2,3,4,5,6};

        for(int i=0;i<=A.length;i++){
            System.out.print (B[i]+" ");
        }
        System.out.println();

        for(int i=B.length-1;i>=0;i--){
            System.out.print(B[i]+" ");
        }
        System.out.println();







    }

}
