package Assignment4;

/**
 * Problem 13: Mobile class
 * Fields: 'brand', 'price'.
 * Method: 'printDetails()'.
 * Create 2 mobiles and show details.
 */
public class Mobile {
    // Fields
    private String brand;
    private double price;
    
    // Constructor
    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    
    // Method to print mobile details
    public void printDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: $" + price);
        System.out.println("---");
    }
    
    // Getters
    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public static void main(String[] args) {
        // Create 2 mobile objects
        Mobile mobile1 = new Mobile("iPhone", 999.99);
        Mobile mobile2 = new Mobile("Samsung Galaxy", 799.99);
        
        // Show details
        System.out.println("Mobile Details:");
        mobile1.printDetails();
        mobile2.printDetails();
    }
}
