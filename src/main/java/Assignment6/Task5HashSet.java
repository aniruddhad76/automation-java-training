package Assignment6;

import java.util.HashSet;

public class Task5HashSet {
    public static void main(String[] args) {
        System.out.println("=== Task 5 - HashSet ===");
        
        // 1. Create a HashSet<String> for 'apiEndpoints'
        HashSet<String> apiEndpoints = new HashSet<>();
        
        // 2. Add: "POST /addOrder", "GET /orderStatus", "POST /addOrder", "DELETE /cancelOrder"
        apiEndpoints.add("POST /addOrder");
        apiEndpoints.add("GET /orderStatus");
        apiEndpoints.add("POST /addOrder"); // Duplicate
        apiEndpoints.add("DELETE /cancelOrder");
        
        // 3. Print all endpoints
        System.out.println("All endpoints: " + apiEndpoints);
        
        // 4. Observe if duplicates are allowed and check the order
        System.out.println("Observe: Duplicates are NOT allowed, order is NOT preserved");
    }
}

