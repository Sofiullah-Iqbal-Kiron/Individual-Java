// An exception is an abnormal condition that arises in a code sequence at run time.
// Runtime error.
// Exception is an object

public class First {
    public static void main(String[] args) {
        try {
            int a = 4, b = 0;
            System.out.println("a / b = " + (a / b));
            System.out.println("Thanks.");
        }
        catch (ArithmeticException e) {
            System.err.println("Trying to divide by zero.");
        }
    }
}
