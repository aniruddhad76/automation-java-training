package Assignment4;

/**
 * Problem 5: Skip blanks in names
 * Given an array of names like '{ "Amit", "", "Ravi", "Sneha" }', skip empty strings using 'continue'.
 */
public class SkipBlanksInNames {
    public static void main(String[] args) {
        String[] names = {"Amit", "", "Ravi", "Sneha", "", "Priya", "John", ""};
        
        System.out.println("Processing names array, skipping empty strings:");
        
        for (String name : names) {
            if (name.isEmpty()) {
                System.out.println("Skipping empty string");
                continue; // Skip empty strings
            }
            
            System.out.println("Name: " + name);
        }
    }
}
