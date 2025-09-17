package com.aw.automationtraining;

import java.util.Scanner;

/**
 * Looping Statements Assignment 2:
 * Print the multiplication table of 5 using a while loop.
 */
public class MultiplicationTableA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Multiplication Table ===");
        System.out.print("Enter a number for multiplication table (default 5): ");
        
        // Allow user to enter custom number or use default 5
        int number;
        try {
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                number = 5;
            } else {
                number = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            number = 5;
            System.out.println("Invalid input, using default number 5");
        }
        
        System.out.println("Multiplication table of " + number + ":");
        
        // Print multiplication table using while loop
        int multiplier = 1;
        while (multiplier <= 10) {
            int result = number * multiplier;
            System.out.println(number + " x " + multiplier + " = " + result);
            multiplier++;
        }
        
        scanner.close();
    }
}
