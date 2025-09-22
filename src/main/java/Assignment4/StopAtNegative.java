package Assignment4;

import java.util.Scanner;

/**
 * Problem 2: Stop at negative
 * Read 10 integers from the user. If any number is negative, stop reading further.
 */
public class StopAtNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        
        System.out.println("Enter 10 integers (program will stop if negative number is entered):");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                System.out.println("Negative number detected: " + number + ". Stopping input.");
                break;
            }
            
            numbers[count] = number;
            count++;
        }
        
        System.out.println("\nNumbers entered before stopping:");
        for (int i = 0; i < count; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        
        scanner.close();
    }
}
