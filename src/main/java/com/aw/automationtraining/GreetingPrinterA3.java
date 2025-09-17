package com.aw.automationtraining;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * Decision-making Statements Assignment 4:
 * Write a program to print "Good Morning", "Good Afternoon", or "Good Evening" 
 * based on the current hour (0–23) using if-else-if.
 */
public class GreetingPrinterA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Greeting Printer ===");
        System.out.println("Choose an option:");
        System.out.println("1. Use current time");
        System.out.println("2. Enter custom hour (0-23)");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        int hour;
        
        if (choice == 1) {
            // Use current time
            hour = LocalTime.now().getHour();
            System.out.println("Current hour: " + hour);
        } else {
            // Get custom hour from user
            System.out.print("Enter hour (0-23): ");
            hour = scanner.nextInt();
            
            // Validate input
            if (hour < 0 || hour > 23) {
                System.out.println("Invalid hour! Please enter a value between 0 and 23.");
                scanner.close();
                return;
            }
        }
        
        // Print greeting based on hour using if-else-if
        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening!");
        }
        
        scanner.close();
    }
}
