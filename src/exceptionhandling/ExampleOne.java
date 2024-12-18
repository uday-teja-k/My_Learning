package exceptionhandling;

public class ExampleOne {
    public static void main(String[] args) {
        int A[] = {10,0,8,3,5};
        int r;
        try {
            r= A[0]/A[1];
            System.out.println(r);
//            System.out.println(A[10]);
        }catch (ArithmeticException e) { // here there should be a subclass of catch block 2 class
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e) { // should have super class of the above class
            System.out.println(e);
        }
    }
}
