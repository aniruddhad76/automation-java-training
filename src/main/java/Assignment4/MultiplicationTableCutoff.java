package Assignment4;

/**
 * Problem 3: Multiplication table cut-off
 * Print the multiplication table of 3 (from '3x1' to '3x10'). If result goes above 15, stop using 'break'.
 */
public class MultiplicationTableCutoff {
    public static void main(String[] args) {
        System.out.println("Multiplication table of 3 (stopping when result > 15):");
        
        for (int i = 1; i <= 10; i++) {
            int result = 3 * i;
            
            if (result > 15) {
                System.out.println("Result " + result + " is above 15. Stopping.");
                break;
            }
            
            System.out.println("3 x " + i + " = " + result);
        }
    }
}
