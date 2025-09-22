package Assignment4;

/**
 * Problem 15: Movie class
 * Fields: 'title', 'rating'.
 * Method: 'printDetails()'.
 * Create 2 movies and show details.
 */
public class Movie {
    // Fields
    private String title;
    private double rating;
    
    // Constructor
    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
    
    // Method to print movie details
    public void printDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Movie Rating: " + rating + "/10");
        System.out.println("---");
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public double getRating() {
        return rating;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public static void main(String[] args) {
        // Create 2 movie objects
        Movie movie1 = new Movie("The Shawshank Redemption", 9.3);
        Movie movie2 = new Movie("Inception", 8.8);
        
        // Show details
        System.out.println("Movie Details:");
        movie1.printDetails();
        movie2.printDetails();
    }
}
