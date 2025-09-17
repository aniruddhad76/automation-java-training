package com.aw.automationtraining;

import java.util.Scanner;

/**
 * Decision-making Statements Assignment 1:
 * Write a program to check if a number is even or odd using if-else.
 */
public class EvenOddCheckerA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Even or Odd Number Checker ===");
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        
        // Check if number is even or odd using if-else
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        
        scanner.close();
    }
}
