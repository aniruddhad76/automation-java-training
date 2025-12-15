package PracticeAssignments;

public class StringImmutabilityDemo {

    public static void main(String[] args) {
        String s = "QA";
        String newString = s.concat(" Engineer");

        System.out.println("Original string: " + s);
        System.out.println("New string: " + newString);

        // Strings are immutable in Java, so concat() creates a new object
        // and does not modify the original 's' instance.
    }
}

