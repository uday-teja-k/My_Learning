package exceptionhandling;

public class Example {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;

            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("error dividing with zero");
        }
        System.out.println("End of program");
        System.out.println("Bye");

    }
}
