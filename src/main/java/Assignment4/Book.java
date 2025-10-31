package Assignment4;

/**
 * Problem 11: Book class
 */
public class Book {
    // Fields
    private String title;
    private String author;
    
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Method to show book information
    public void showInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("---");
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public static void main(String[] args) {
        // Create 3 book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        
        // Print their info
        System.out.println("Book Information:");
        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
    }
}
