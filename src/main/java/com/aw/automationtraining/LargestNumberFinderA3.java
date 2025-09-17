package com.aw.automationtraining;

import java.util.Scanner;

/**
 * Decision-making Statements Assignment 2:
 * Write a program to find the largest of three numbers using if-else-if.
 */
public class LargestNumberFinderA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Largest Number Finder ===");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Find the largest number using if-else-if
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
        
        scanner.close();
    }
}
