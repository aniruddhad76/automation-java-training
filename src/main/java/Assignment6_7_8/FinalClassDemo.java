package Assignment6_7_8;

// 3. Final Class Demo

// Create a final class 'TestConstants' that has constants like 'BASE_URL', 'USERNAME', 'PASSWORD'
final class TestConstants1 {
    public static final String BASE_URL = "https://example.com";
    public static final String USERNAME = "testuser";
    public static final String PASSWORD = "testpass";
    
    // Private constructor to prevent instantiation
    private TestConstants1() {
    }
}


public class FinalClassDemo {
    public static void main(String[] args) {
        System.out.println("=== 3. Final Class ===");
        
        // Access the constants from the final class
        System.out.println("BASE_URL: " + TestConstants1.BASE_URL);
        System.out.println("USERNAME: " + TestConstants1.USERNAME);
        System.out.println("PASSWORD: " + TestConstants1.PASSWORD);
        
        System.out.println("Note: Uncomment the ExtendedConstants class above to see the compiler error");
    }
}

