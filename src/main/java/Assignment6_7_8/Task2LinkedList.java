package Assignment6_7_8;

import java.util.LinkedList;

public class Task2LinkedList {
    public static void main(String[] args) {
        System.out.println("=== Task 2 - LinkedList ===");
        
        // 1. Create a LinkedList<String> named 'browsers'
        LinkedList<String> browsers = new LinkedList<>();
        
        // 2. Add "Chrome", "Edge", "Firefox"
        browsers.add("Chrome");
        browsers.add("Edge");
        browsers.add("Firefox");
        
        // 3. Add "Safari" at the first position and "Opera" at the last position
        browsers.addFirst("Safari");
        browsers.addLast("Opera");
        
        // 4. Remove "Edge"
        browsers.remove("Edge");
        
        // 5. Print all browsers
        System.out.println("All browsers: " + browsers);
    }
}

