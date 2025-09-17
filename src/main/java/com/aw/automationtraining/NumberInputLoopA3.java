package com.aw.automationtraining;

import java.util.Scanner;

/**
 * Looping Statements Assignment 3:
 * Write a program using do-while that keeps asking the user to enter a number until they enter 0.
 */
public class NumberInputLoopA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Number Input Loop ===");
        System.out.println("Enter numbers (enter 0 to exit):");
        
        int number;
        
        // Keep asking for numbers until user enters 0 using do-while
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0);
        
        System.out.println("Program ended. You entered 0 to exit.");
        
        scanner.close();
    }
}
