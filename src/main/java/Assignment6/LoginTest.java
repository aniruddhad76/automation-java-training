package Assignment6;

public class LoginTest extends BaseTest {
    // Try to override setup() - this will cause a compiler error
    // Uncomment the method below to see the error:
    /*
    @Override
    public void setup() {
        System.out.println("LoginTest setup");
    }
    */
    
    public void testLogin() {
        System.out.println("Testing login functionality");
        setup(); // Can call the final method, but cannot override it
    }
}

