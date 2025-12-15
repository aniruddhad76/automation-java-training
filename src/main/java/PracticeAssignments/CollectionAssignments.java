package PracticeAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class CollectionAssignments {

    public static void main(String[] args) {
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Chrome"); // duplicate

        System.out.println("ArrayList of browsers: " + browsers);

        Set<String> uniqueBrowsers = new HashSet<>(browsers);
        System.out.println("HashSet without duplicates: " + uniqueBrowsers);

        Map<String, String> testStatus = new HashMap<>();
        testStatus.put("LoginTest", "Passed");
        testStatus.put("CheckoutTest", "Failed");
        testStatus.put("SearchTest", "Passed");

        System.out.println("HashMap entries (TestCase -> Status):");
        for (Map.Entry<String, String> entry : testStatus.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        System.out.println("LinkedList before removal: " + numbers);
        numbers.removeFirst();
        System.out.println("LinkedList after removing first element: " + numbers);
    }
}

