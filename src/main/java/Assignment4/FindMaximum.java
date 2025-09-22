package Assignment4;

/**
 * Problem 8: Find maximum
 * Create a method 'int max(int a, int b)' that returns the larger number using 'return'.
 */
public class FindMaximum {
    
    /**
     * Method that returns the maximum of two integers
     * @param a First integer
     * @param b Second integer
     * @return The larger of the two numbers
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        // Test the max method
        System.out.println("Maximum of 10 and 20: " + max(10, 20));
        System.out.println("Maximum of 50 and 30: " + max(50, 30));
        System.out.println("Maximum of 15 and 15: " + max(15, 15));
        System.out.println("Maximum of -5 and 10: " + max(-5, 10));
    }
}
