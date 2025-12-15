package PracticeAssignments;

public class CarDemo {

    public static void main(String[] args) {
        Car firstCar = new Car("Toyota", "Camry", 30000);
        Car secondCar = new Car("Tesla", "Model 3", 42000);

        firstCar.displayCarInfo();
        secondCar.displayCarInfo();
    }
}

class Car {
    private final String brand;
    private final String model;
    private final double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayCarInfo() {
        System.out.println("Car -> Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

