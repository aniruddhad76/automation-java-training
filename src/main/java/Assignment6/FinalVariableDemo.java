package Assignment6;

// 1. Final Variable Demo

// Create a 'final' variable 'MAX_WAIT_TIME = 30' in a 'WaitConfig' class
class WaitConfig1 {
    public static final int MAX_WAIT_TIME = 30;
}

public class FinalVariableDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Final Variable ===");
        
        // Access the final variable
        System.out.println("MAX_WAIT_TIME: " + WaitConfig1.MAX_WAIT_TIME);
        
        // Try modifying it and observe the compiler error
        // Uncomment the line below to see the compiler error:
        // WaitConfig1.MAX_WAIT_TIME = 40; // Compiler error: cannot assign a value to final variable MAX_WAIT_TIME
        
        System.out.println("Note: Uncomment the assignment line above to see the compiler error");
    }
}

