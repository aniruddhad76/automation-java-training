package Assignment6;

import java.util.TreeSet;

public class Task8TreeSet {
    public static void main(String[] args) {
        System.out.println("=== Task 8 - TreeSet ===");
        
        // 1. Create a TreeSet<String> named 'countries'
        TreeSet<String> countries = new TreeSet<>();
        
        // 2. Add: "India", "USA", "Germany", "Australia", "India"
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("India"); // Duplicate
        
        // 3. Print all countries — observe natural sorting
        System.out.println("All countries (naturally sorted): " + countries);
        
        // 4. Use methods: first(), last(), headSet("Germany"), tailSet("Germany")
        System.out.println("First country: " + countries.first());
        System.out.println("Last country: " + countries.last());
        System.out.println("HeadSet (before 'Germany'): " + countries.headSet("Germany"));
        System.out.println("TailSet (from 'Germany' onwards): " + countries.tailSet("Germany"));
    }
}

