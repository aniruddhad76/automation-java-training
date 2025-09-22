package Assignment4;

/**
 * Problem 4: Skip multiples of 3
 * Print numbers 1 to 15, but skip all multiples of 3 using 'continue'.
 */
public class SkipMultiplesOf3 {
    public static void main(String[] args) {
        System.out.println("Printing numbers 1 to 15, skipping multiples of 3:");
        
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                System.out.println("Skipping " + i + " (multiple of 3)");
                continue; // Skip multiples of 3
            }
            
            System.out.println("Number: " + i);
        }
    }
}
