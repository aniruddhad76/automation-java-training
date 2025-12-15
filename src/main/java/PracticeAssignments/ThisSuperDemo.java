package PracticeAssignments;

public class ThisSuperDemo {

    public static void main(String[] args) {
        Student student = new Student("Jordan", 22, "Automation");
        student.showDetails();
    }
}

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    private String course;

    Student(String name, int age, String course) {
        super(name, age); // Call parent constructor
        this.course = course; // Reference current class variable
    }

    void showDetails() {
        System.out.println("Student -> Name: " + this.name + ", Age: " + this.age + ", Course: " + this.course);
    }
}

