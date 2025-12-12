package Assignment6;

// 3. Static Method Demo

// Add a static method 'getBrowserInfo()' returning "Running tests on Chrome browser"
class BrowserConfig3 {
    static String browserName = "Chrome";
    
    // Static method
    public static String getBrowserInfo() {
        return "Running tests on Chrome browser";
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== 3. Static Method ===");
        
        // Call this method directly in 'main()' without creating an object
        String info = BrowserConfig3.getBrowserInfo();
        System.out.println(info);
    }
}

