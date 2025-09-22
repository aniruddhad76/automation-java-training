package Assignment4;

/**
 * Problem 1: Find first even number
 */
public class FirstEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 8, 9, 12, 15, 18, 21, 24};
        
        System.out.println("Printing numbers until first even number:");
        
        for (int number : numbers) {
            System.out.println("Checking number: " + number);
            
            if (number % 2 == 0) {
                System.out.println("Found first even number: " + number);
                break; // Stop when first even number is found
            }
        }
    }
}
