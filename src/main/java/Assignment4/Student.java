package Assignment4;

/**
 * Problem 10: Student class
 * Fields: 'name', 'age'.
 * Method: 'display()'.
 * Create 2 student objects and display details.
 */
public class Student {
    // Fields
    private String name;
    private int age;
    
    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("---");
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        // Create 2 student objects
        Student student1 = new Student("Alice Johnson", 20);
        Student student2 = new Student("Bob Smith", 22);
        
        // Display details
        System.out.println("Student Details:");
        student1.display();
        student2.display();
    }
}
