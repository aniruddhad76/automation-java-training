package PracticeAssignments;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String name = "Alex Automation";

        // 1. Reverse using StringBuilder
        String reversedName = new StringBuilder(name).reverse().toString();

        // 2. Append welcome message using StringBuffer
        StringBuffer finalMessage = new StringBuffer(reversedName);
        finalMessage.append(" Welcome to Automation Training");

        // 3. Print final message
        System.out.println(finalMessage.toString());
    }
}

