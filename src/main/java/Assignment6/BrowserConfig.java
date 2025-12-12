package Assignment6;

public class BrowserConfig {
    // Static variable
    public static String browserName = "Chrome";
    
    // Static block
    static {
        System.out.println("Static block executed: Loading default browser configuration...");
    }
    
    // Static method
    public static String getBrowserInfo() {
        return "Running tests on Chrome browser";
    }
}

