package Assignment6_7_8;

// 2. Static Block Demo

// In 'BrowserConfig', add a static block that prints:
// "Static block executed: Loading default browser configuration..."
class BrowserConfig2 {
    static String browserName = "Chrome";
    
    // Static block
    static {
        System.out.println("Static block executed: Loading default browser configuration...");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("=== 2. Static Block ===");
        System.out.println("Main method started");
        
        // Access the class to trigger static block execution
        // Run the program and observe when the static block executes (before or after 'main()')
        System.out.println("Browser name: " + BrowserConfig2.browserName);
        
        System.out.println("Main method ended");
        System.out.println("Observe: Static block executes BEFORE main() when class is first loaded");
    }
}

