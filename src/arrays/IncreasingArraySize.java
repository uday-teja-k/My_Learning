package arrays;

public class IncreasingArraySize {

    public static void main(String[] args){


        int []A = {8,6,5,3,4};
        int []B = new int[10];
        System.out.println("length of A="+A.length);

        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        System.out.println("length of A="+A.length);



    }
}
