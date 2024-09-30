package arrays;

public class SecondLargestElement {

    public static void main(String[] args){

        int[] A ={-9,-9,-7,-3,-12,-6,-15,-5,-4,-100,-200,-450,-451};
        int max1 = A[0];
        int max2 = A[0];

        for (int i=0;i< A.length;i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("max1 is "+max1);
        System.out.println("max2 is "+max2);















    }
}
