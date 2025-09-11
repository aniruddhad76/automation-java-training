package com.aw.automationtraining;

/**
 * Basic HelloWorld class demonstrating Java fundamentals
 * This class shows how JDK, JRE, and JVM work together
 */
public class HelloWorld {
    
    // Static method - can be called without creating an instance
    public static void main(String[] args) {
        System.out.println("=== Java Fundamentals Demo ===");
        System.out.println("Hello, Automation World!");
        
        // Demonstrate JVM memory management
        demonstrateMemoryManagement();
        
        // Demonstrate JRE library usage
        demonstrateJreLibraries();
        
        // Demonstrate class loading
        demonstrateClassLoading();
    }
    
    /**
     * Demonstrates how JVM manages memory
     * In automation, this is crucial for managing WebDriver instances
     */
    private static void demonstrateMemoryManagement() {
        System.out.println("\n--- Memory Management Demo ---");
        
        // Create objects (like WebDriver instances)
        String testData = "Sample test data";
        Integer testCount = 100;
        
        System.out.println("Created objects: " + testData + ", " + testCount);
        System.out.println("JVM manages memory for these objects");
        System.out.println("Garbage collector will clean them up when not needed");
        
        // In real automation, you'd do:
        // WebDriver driver = new ChromeDriver();
        // ... use driver ...
        // driver.quit(); // Explicit cleanup
    }
    
    /**
     * Demonstrates JRE library usage
     * These libraries are essential for automation frameworks
     */
    private static void demonstrateJreLibraries() {
        System.out.println("\n--- JRE Libraries Demo ---");
        
        // java.util - Collections (used by Rest Assured for JSON parsing)
        java.util.List<String> testSteps = new java.util.ArrayList<>();
        testSteps.add("Navigate to URL");
        testSteps.add("Find element");
        testSteps.add("Perform action");
        
        System.out.println("Test steps: " + testSteps);
        System.out.println("JRE provides java.util.* libraries for data structures");
        
        // java.net - Networking (used by Rest Assured for HTTP calls)
        System.out.println("JRE provides java.net.* libraries for HTTP communication");
        System.out.println("Rest Assured uses these for API testing");
        
        // java.lang - Core language features
        System.out.println("Current time: " + System.currentTimeMillis());
        System.out.println("JRE provides java.lang.* for core functionality");
    }
    
    /**
     * Demonstrates class loading
     * Shows how JVM loads classes into memory
     */
    private static void demonstrateClassLoading() {
        System.out.println("\n--- Class Loading Demo ---");
        
        // Get class information
        Class<?> clazz = HelloWorld.class;
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Class loader: " + clazz.getClassLoader());
        System.out.println("Package: " + clazz.getPackage());
        
        // In automation, this is how Selenium and Rest Assured classes are loaded
        System.out.println("Selenium and Rest Assured classes are loaded the same way");
    }
}

