package Assignment4;

/**
 * Problem 9: Check eligibility
 * Create a method 'boolean isEligible(int age)' that returns true if age ≥ 18, otherwise false.
 */
public class CheckEligibility {
    
    /**
     * Method that checks if a person is eligible based on age
     * @param age The age to check
     * @return true if age >= 18, false otherwise
     */
    public static boolean isEligible(int age) {
        return age >= 18;
    }
    
    public static void main(String[] args) {
        // Test the isEligible method
        int[] ages = {16, 18, 20, 15, 25, 17, 30};
        
        System.out.println("Checking eligibility for different ages:");
        for (int age : ages) {
            boolean eligible = isEligible(age);
            System.out.println("Age " + age + ": " + (eligible ? "Eligible" : "Not eligible"));
        }
    }
}
