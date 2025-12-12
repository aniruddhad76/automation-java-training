package Assignment6;

import java.util.Stack;

public class Task4Stack {
    public static void main(String[] args) {
        System.out.println("=== Task 4 - Stack ===");
        
        // 1. Create a Stack<String> named 'pagesVisited'
        Stack<String> pagesVisited = new Stack<>();
        
        // 2. Push "LoginPage", "HomePage", "CartPage"
        pagesVisited.push("LoginPage");
        pagesVisited.push("HomePage");
        pagesVisited.push("CartPage");
        
        System.out.println("Pages visited: " + pagesVisited);
        
        // 3. Pop one element (simulate "back" button)
        String poppedPage = pagesVisited.pop();
        System.out.println("Popped page (back button): " + poppedPage);
        
        // 4. Peek the current page on top
        String currentPage = pagesVisited.peek();
        System.out.println("Current page on top: " + currentPage);
        
        // 5. Print all elements
        System.out.println("All elements in stack: " + pagesVisited);
    }
}

