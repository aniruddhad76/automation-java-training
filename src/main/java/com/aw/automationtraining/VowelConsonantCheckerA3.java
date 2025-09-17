package com.aw.automationtraining;

import java.util.Scanner;

/**
 * Decision-making Statements Assignment 3:
 * Write a program that takes a character input and checks if it is a vowel or consonant using switch.
 */
public class VowelConsonantCheckerA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Vowel or Consonant Checker ===");
        System.out.print("Enter a character: ");
        
        char ch = scanner.next().charAt(0);
        
        // Convert to lowercase for easier comparison
        char lowercaseCh = Character.toLowerCase(ch);
        
        // Check if character is a vowel or consonant using switch
        switch (lowercaseCh) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                // Check if it's a letter
                if ((lowercaseCh >= 'a' && lowercaseCh <= 'z')) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not a letter.");
                }
                break;
        }
        
        scanner.close();
    }
}
