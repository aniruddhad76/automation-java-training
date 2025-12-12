package Assignment6;

import java.util.SortedSet;
import java.util.TreeSet;

public class Task7SortedSet {
    public static void main(String[] args) {
        System.out.println("=== Task 7 - SortedSet ===");
        
        // 1. Create a SortedSet<Integer> named 'responseTimes'
        SortedSet<Integer> responseTimes = new TreeSet<>();
        
        // 2. Add response times (in ms): 320, 150, 180, 450, 150
        responseTimes.add(320);
        responseTimes.add(150);
        responseTimes.add(180);
        responseTimes.add(450);
        responseTimes.add(150); // Duplicate
        
        // 3. Print the sorted set
        System.out.println("Sorted response times: " + responseTimes);
        
        // 4. Try removing the smallest and largest element using first() and last()
        Integer smallest = responseTimes.first();
        Integer largest = responseTimes.last();
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
        
        responseTimes.remove(smallest);
        responseTimes.remove(largest);
        System.out.println("After removing smallest and largest: " + responseTimes);
    }
}

