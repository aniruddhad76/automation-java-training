package PracticeAssignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedVsUncheckedDemo {

    public static void main(String[] args) {
        Path filePath = Path.of("sample.txt");

        try {
            String content = Files.readString(filePath);
            System.out.println("File content: " + content);
        } catch (IOException ioException) { // checked exception
            System.out.println("Handled IOException: " + ioException.getMessage());
        }

        try {
            int value = 5 / 0;
            System.out.println("Value: " + value);
        } catch (ArithmeticException arithmeticException) { // unchecked exception
            System.out.println("Handled ArithmeticException: " + arithmeticException.getMessage());
        }
    }
}

