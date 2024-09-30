package arrays;

public class ArrayOne {

    public static void main(String[] args) {

        // int A[] = new int[10];

        float B[]={1,2,3,4,5};
        // int C[];
        // C= new int[10];

        // int []D = new int[10];

        B[2]=15;
        // for(int i=0;i<A.length;i++){
        //     System.out.println(A[i]);
        // }

        for(int i=0; i<B.length;i++){
            System.out.println(B[i]++);
        }
        System.out.println("-----------------");
        for (float x : B) {
            System.out.println(x);
        }

        System.out.println(B.length);



















    }

}
