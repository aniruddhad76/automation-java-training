package Assignment6_7_8;

// 2. Final Method Demo

// Create a class 'BaseTest' with a final method 'setup()' that prints "Base setup complete"
class BaseTest1 {
    // Final method
    public final void setup() {
        System.out.println("Base setup complete");
    }
}

// Create a subclass 'LoginTest' and try to override 'setup()' (observe the error)/*
class LoginTest1 extends BaseTest1 {
       
    public void testLogin() {
        System.out.println("Testing login functionality");
        setup(); // Can call the final method, but cannot override it
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== 2. Final Method ===");
        
        LoginTest1 loginTest = new LoginTest1();
        loginTest.testLogin();
        
        System.out.println("Note: Uncomment the override method in LoginTest1 to see the compiler error");
    }
}

