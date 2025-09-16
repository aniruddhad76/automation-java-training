package com.aw.automationtraining;

public class VariablesA2 {
    public static void main(String[] args) {
        
        // 1) Variables
        String name = "ani";
        int age = 28;
        double marks = 92.7;
        boolean isPassed = true;        

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + isPassed);

        // 2) Change Value of Variables
        int counter = 1;
        System.out.println("Counter (initial): " + counter);
        counter = 2; 
        System.out.println("Counter (after change): " + counter);

        // 3) Scope of Variables
        int insideMainVar = 100; 
        System.out.println("insideMainVar (inside main): " + insideMainVar);
        
        // 4) Constants
        final double PI = 3.14;
        System.out.println("PI: " + PI);
        
    }

}
