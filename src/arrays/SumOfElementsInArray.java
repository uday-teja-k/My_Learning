package arrays;

public class SumOfElementsInArray {

    public static void main(String[] args){

        int A[] ={3,9,7,8,12,6,15,5,4,11};
        int sum=0;

        // for(int i=0;i<A.length;i++){
        //     sum=sum+A[i];
        // }

        for (int x : A) {
            sum=sum+x;

        }
        System.out.println("Sum is "+sum);


    }

}
