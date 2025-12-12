package Assignment6;

import java.util.Enumeration;
import java.util.Vector;

public class Task3Vector {
    public static void main(String[] args) {
        System.out.println("=== Task 3 - Vector ===");
        
        // 1. Create a Vector<Integer> to store response codes (200, 404, 500, 302)
        Vector<Integer> responseCodes = new Vector<>();
        responseCodes.add(200);
        responseCodes.add(404);
        responseCodes.add(500);
        responseCodes.add(302);
        
        // 2. Add elements, then print them using Enumeration
        System.out.println("Response codes using Enumeration:");
        Enumeration<Integer> enumeration = responseCodes.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("  " + enumeration.nextElement());
        }
        
        // 3. Add and remove some values, observe the order
        responseCodes.add(201);
        responseCodes.removeElement(404);
        System.out.println("After adding 201 and removing 404: " + responseCodes);
    }
}

