package arrays;

public class DeleteArrayElement {

    public static void main(String[] args) {

        int[] A = new int[10];

        A[0] = 5;
        A[1] = 10;
        A[2] = 15;
        A[3] = 20;
        A[4] = 25;
        A[5] = 30;

        int noofelements = 6;
        int target = 2;  //element we wish to remove

        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        //loop from target to the logical end of the array
        for (int i = target; i < noofelements; i++) {
            //copy the next element into this position
            A[i] = A[i + 1];
        }
        //reset tje last element to zero
        A[noofelements - 1] = 0;

        //decrease the logical size
        noofelements--;

        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
}




