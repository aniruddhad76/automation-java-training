package PracticeAssignments;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException: " + ex.getMessage());
        } finally {
            System.out.println("Division complete");
        }
    }
}

