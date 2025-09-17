package com.aw.automationtraining;

/**
 * Looping Statements Assignment 4:
 * Create an array of 5 fruits and print them using an enhanced for loop.
 */
public class FruitArrayPrinterA3 {

    public static void main(String[] args) {
        System.out.println("===: The Fruit Array Printer :===");
        
        // Create an array of 5 fruits
        String[] fruits = {"Apple", "Banana", "Orange", "Grape", "Mango"};
        
        System.out.println("List of fruits:");
        
        // Print fruits using enhanced for loop (for-each loop)
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        System.out.println("\nTotal fruits: " + fruits.length);
    }
}
