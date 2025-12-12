package Assignment6;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1ArrayList {
    public static void main(String[] args) {
        System.out.println("=== Task 1 - ArrayList ===");
        
        // 1. Create an ArrayList<String> named 'testCases'
        ArrayList<String> testCases = new ArrayList<>();
        
        // 2. Add test case names: "LoginTest", "LogoutTest", "AddItemTest", "AddItemTest"
        testCases.add("LoginTest");
        testCases.add("LogoutTest");
        testCases.add("AddItemTest");
        testCases.add("AddItemTest");
        
        // 3. Print all test case names
        System.out.println("All test case names: " + testCases);
        
        // 4. Access the second element and print it
        System.out.println("Second element: " + testCases.get(1));
        
        // 5. Remove one element and print the updated list
        testCases.remove(0);
        System.out.println("After removing first element: " + testCases);
        
        // 6. Iterate using normal for loop
        System.out.println("Using normal for loop:");
        for (int i = 0; i < testCases.size(); i++) {
            System.out.println("  " + testCases.get(i));
        }
        
        // 6. Iterate using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String testCase : testCases) {
            System.out.println("  " + testCase);
        }
        
        // 6. Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = testCases.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}

