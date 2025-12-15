package PracticeAssignments;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sam");
        employee.setId(101);
        employee.setSalary(85000.0);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}

class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

