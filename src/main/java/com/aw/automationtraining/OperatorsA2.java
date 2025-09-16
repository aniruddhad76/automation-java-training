package com.aw.automationtraining;

public class OperatorsA2 {
    public static void main(String[] args) 
    {
      System.out.println("Operators");
        System.out.println("Arithmetic Operators");
        int a = 10, b = 3;
         System.out.println("a + b = " + (a + b));
         System.out.println("a - b = " + (a - b));
         System.out.println("a * b = " + (a * b));
         System.out.println("a / b = " + (a / b));
         System.out.println("a % b = " + (a % b));

         System.out.println("Relational Operators");
        // Relational Operators
        int x = 5, y = 10;
        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y));

        System.out.println("Logical Operators");
        // Logical Operators
        boolean hasPen = true, hasBook = false;
        System.out.println("hasPen && hasBook = " + (hasPen && hasBook));
        System.out.println("hasPen || hasBook = " + (hasPen || hasBook));
        System.out.println("!hasBook = " + (!hasBook));

        System.out.println("Assignment Operators");
        // Assignment Operators
        int num = 10;
        System.out.println("num = " + num);
        num += 5;
        System.out.println("num += 5 -> " + num);
        num -= 2;
        System.out.println("num -= 2 -> " + num);
        num *= 3;
        System.out.println("num *= 3 -> " + num);
        num /= 4;
        System.out.println("num /= 4 -> " + num);

        System.out.println("Ternary Operator");
        // Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary result: " + result);
    }

    
}
