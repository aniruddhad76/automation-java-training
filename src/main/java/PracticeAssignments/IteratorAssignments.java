package PracticeAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAssignments {

    public static void main(String[] args) {
        List<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Safari");

        System.out.println("For-each loop output:");
        for (String browser : browsers) {
            System.out.println(browser);
        }

        System.out.println("Iterator removal (removing 'Edge'):");
        Iterator<String> iterator = browsers.iterator();
        while (iterator.hasNext()) {
            String browser = iterator.next();
            if ("Edge".equals(browser)) {
                iterator.remove();
                System.out.println("Removed: " + browser);
            }
        }
        System.out.println("List after iterator removal: " + browsers);
    }
}

