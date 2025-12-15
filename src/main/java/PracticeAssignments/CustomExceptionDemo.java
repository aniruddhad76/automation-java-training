package PracticeAssignments;

import java.util.Scanner;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Eligible for driving license.");
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible for driving license");
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

