package Assignment6;

// 1. Static Variable Demo

// Create a class 'BrowserConfig' with a static variable 'browserName = "Chrome"'
class BrowserConfig1 {
    static String browserName = "Chrome";
}

// Create another class 'TestExecution' and print the browser name without creating an object
public class StaticVariableDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Static Variable ===");
        
        // Print the browser name without creating an object
        System.out.println("Initial Browser: " + BrowserConfig1.browserName);
        
        // Change the browser name to "Edge" and print it again
        BrowserConfig1.browserName = "Edge";
        System.out.println("Updated Browser: " + BrowserConfig1.browserName);
    }
}

