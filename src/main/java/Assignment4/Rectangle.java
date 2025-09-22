package Assignment4;

/**
 * Problem 12: Rectangle class
 * Fields: 'length', 'width'.
 * Methods: 'area()', 'perimeter()'.
 * Create object and print area + perimeter.
 */
public class Rectangle {
    // Fields
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    public double area() {
        return length * width;
    }
    
    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }
    
    // Getters
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    // Setters
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public static void main(String[] args) {
        // Create rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        
        // Print area and perimeter
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
