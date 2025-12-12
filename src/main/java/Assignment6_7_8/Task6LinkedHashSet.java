package Assignment6_7_8;

import java.util.LinkedHashSet;

public class Task6LinkedHashSet {
    public static void main(String[] args) {
        System.out.println("=== Task 6 - LinkedHashSet ===");
        
        // 1. Create a LinkedHashSet<String> named 'executedTests'
        LinkedHashSet<String> executedTests = new LinkedHashSet<>();
        
        // 2. Add: "LoginTest", "AddToCartTest", "PaymentTest", "LoginTest"
        executedTests.add("LoginTest");
        executedTests.add("AddToCartTest");
        executedTests.add("PaymentTest");
        executedTests.add("LoginTest"); // Duplicate
        
        // 3. Print all elements and notice insertion order is preserved
        System.out.println("All executed tests: " + executedTests);
        System.out.println("Observe: Insertion order is preserved, duplicates are NOT allowed");
    }
}

