package com.aw.automationtraining;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates how Java fundamentals apply to automation testing
 * This class shows practical examples of JDK, JRE, JVM concepts in automation context
 */
public class AutomationFundamentalsDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Automation Testing Fundamentals Demo ===\n");
        
        demonstrateJvmInAutomation();
        demonstrateJreLibrariesInAutomation();
        demonstrateJdkToolsInAutomation();
        demonstrateMemoryManagementInTests();
    }
    
    /**
     * Shows how JVM executes automation code
     */
    private static void demonstrateJvmInAutomation() {
        System.out.println("--- JVM in Automation Testing ---");
        
        // Simulate what happens when Selenium starts
        System.out.println("1. JVM loads Selenium classes into memory");
        System.out.println("2. JVM creates WebDriver objects");
        System.out.println("3. JVM manages browser process communication");
        
        // Example of bytecode execution
        String browserType = "Chrome";
        boolean isHeadless = false;
        
        System.out.println("Browser configuration: " + browserType + ", Headless: " + isHeadless);
        System.out.println("JVM executes this bytecode on any platform (Windows, Mac, Linux)");
        System.out.println("This is why Selenium tests can run cross-platform\n");
    }
    
    /**
     * Shows how JRE libraries support automation frameworks
     */
    private static void demonstrateJreLibrariesInAutomation() {
        System.out.println("--- JRE Libraries in Automation ---");
        
        // java.util - Collections for test data
        Map<String, String> testConfig = new HashMap<>();
        testConfig.put("baseUrl", "https://example.com");
        testConfig.put("timeout", "30");
        testConfig.put("browser", "chrome");
        
        System.out.println("Test configuration: " + testConfig);
        System.out.println("JRE provides java.util.* for managing test data");
        
        // java.net - HTTP communication for Rest Assured
        System.out.println("JRE provides java.net.* for HTTP requests in Rest Assured");
        System.out.println("This enables API testing without external libraries");
        
        // java.lang - Core functionality
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("JRE provides threading support for parallel test execution");
        System.out.println("System properties: " + System.getProperty("java.version"));
        System.out.println("JRE provides system information for test environment setup\n");
    }
    
    /**
     * Shows how JDK tools support automation development
     */
    private static void demonstrateJdkToolsInAutomation() {
        System.out.println("--- JDK Tools in Automation Development ---");
        
        System.out.println("1. javac (Compiler):");
        System.out.println("   - Compiles test code into bytecode");
        System.out.println("   - Enables type safety for WebDriver methods");
        System.out.println("   - Catches errors before runtime");
        
        System.out.println("\n2. jdb (Debugger):");
        System.out.println("   - Helps debug test failures");
        System.out.println("   - Inspect WebDriver state during test execution");
        System.out.println("   - Step through test code line by line");
        
        System.out.println("\n3. javadoc (Documentation):");
        System.out.println("   - Generates API documentation for test utilities");
        System.out.println("   - Documents test methods and their purposes");
        
        System.out.println("\n4. IDE Integration:");
        System.out.println("   - IntelliJ IDEA, Eclipse use JDK tools");
        System.out.println("   - Provides code completion for Selenium/Rest Assured");
        System.out.println("   - Enables refactoring and debugging support\n");
    }
    
    /**
     * Shows memory management considerations in automation tests
     */
    private static void demonstrateMemoryManagementInTests() {
        System.out.println("--- Memory Management in Automation Tests ---");
        
        // Simulate test data creation
        System.out.println("Creating test data...");
        String[] testUrls = new String[1000];
        for (int i = 0; i < testUrls.length; i++) {
            testUrls[i] = "https://test" + i + ".example.com";
        }
        
        System.out.println("Created " + testUrls.length + " test URLs");
        System.out.println("Memory allocated for test data");
        
        // Simulate cleanup (important in automation)
        System.out.println("\nCleaning up test data...");
        testUrls = null; // Mark for garbage collection
        
        System.out.println("In real automation tests:");
        System.out.println("- WebDriver instances must be properly closed");
        System.out.println("- Test data should be cleaned up after each test");
        System.out.println("- JVM garbage collector handles memory cleanup");
        System.out.println("- Memory leaks can cause test instability");
        
        // Force garbage collection (for demo purposes)
        System.gc();
        System.out.println("Garbage collection triggered");
        
        // Show memory usage
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        
        System.out.println("Memory usage:");
        System.out.println("Total: " + (totalMemory / 1024 / 1024) + " MB");
        System.out.println("Used: " + (usedMemory / 1024 / 1024) + " MB");
        System.out.println("Free: " + (freeMemory / 1024 / 1024) + " MB");
    }
}

