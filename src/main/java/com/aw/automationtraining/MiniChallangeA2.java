package com.aw.automationtraining;

public class MiniChallangeA2 {
    public static void main(String[] args) {    
        System.out.println("Mini Challenge");
        
        System.out.println("\n-- Part 4: Mini Challenge --");
		int maths = 75, science = 60, english = 80;
		int total = maths + science + english;
		int percentage = (total * 100) / 300;
		String status = (percentage >= 40) ? "Pass" : "Fail";
		System.out.println("Total = " + total);
		System.out.println("Percentage = " + percentage + "%");
		System.out.println("Result = " + status);

    }

}
