package Assignment4;

/**
 * Problem 7: Simple greeting
 * Create a method 'String greet(String name)' that returns '"Hello <name>"'.
 */
public class SimpleGreeting {
    
    /**
     * Method that returns a greeting message
     * @param name The name to greet
     * @return Greeting message "Hello <name>"
     */
    public static String greet(String name) {
        return "Hello " + name;
    }
    
    public static void main(String[] args) {
        // Test the greet method
        System.out.println(greet("Alice"));
        System.out.println(greet("Bob"));
        System.out.println(greet("World"));
    }
}
