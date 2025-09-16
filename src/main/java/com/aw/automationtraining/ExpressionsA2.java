package com.aw.automationtraining;

public class ExpressionsA2 {

    public static void main(String[] args) {

        System.out.println("Expressions");
        int length = 5, breadth = 3;
		int area = length * breadth;
		System.out.println("Area = " + area);

        System.out.println("Math Expression");
		// Math Expression
		int marks1 = 80, marks2 = 90, marks3 = 70;
		int average = (marks1 + marks2 + marks3) / 3;
		System.out.println("Average = " + average);

        System.out.println("String Expression");
		// String Expression
		String firstName = "Swapnil";
		String lastName = "Kamble";
		String fullName = firstName + " " + lastName;
		System.out.println("Full Name = " + fullName);

        System.out.println("Combined Expression");
		// Combined Expression
		int totalMarks = 500;
		int obtained = 420;
		int percentage = (obtained * 100) / totalMarks;
		System.out.println("Percentage = " + percentage + "%");
    }

}
