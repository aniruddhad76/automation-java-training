package Assignment4;

/**
 * Problem 6: Skip odd numbers
 * Print all even numbers between 1 and 20 by skipping odds using 'continue'.
 */
public class SkipOddNumbers {
    public static void main(String[] args) {
        System.out.println("Printing even numbers between 1 and 20:");
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            
            System.out.println("Even number: " + i);
        }
    }
}
