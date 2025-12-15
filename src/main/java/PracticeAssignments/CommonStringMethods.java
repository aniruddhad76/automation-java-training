package PracticeAssignments;

public class CommonStringMethods {

    public static void main(String[] args) {
        String sentence = "Selenium makes browser automation easier";
        String csvBrowsers = "Chrome,Firefox,Edge";
        String role = "Java Automation Engineer";

        boolean hasSelenium = sentence.contains("Selenium");
        System.out.println("Contains 'Selenium': " + hasSelenium);

        String[] browsers = csvBrowsers.split(",");
        System.out.print("Browsers from CSV: ");
        for (int i = 0; i < browsers.length; i++) {
            System.out.print(browsers[i]);
            if (i < browsers.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        String automation = role.substring(5, 15);
        System.out.println("Extracted substring: " + automation);
    }
}

