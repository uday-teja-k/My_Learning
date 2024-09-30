package arrays;

public class RightRotatingArray {

    public static void main(String[] args) {

        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        int temp = A[A.length-1];
        System.out.println("array before rotation is ");
        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("array after rotation is ");
        for (int i=A.length-1; i>0;i--) {
            A[i]=A[i-1];
        }
        A[0] = temp;
        for (int x : A) {
            System.out.print(x + ", ");

        }

    }

}