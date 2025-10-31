package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Assignment5Demo {

	public static void main(String[] args) {
		// A) Method Overloading
		Calculator calculator = new Calculator();
		System.out.println("add(int, int): " + calculator.add(2, 3));
		System.out.println("add(double, double): " + calculator.add(2.5, 3.7));
		System.out.println("add(int, int, int): " + calculator.add(1, 2, 3));

		Greeter greeter = new Greeter();
		greeter.sayHello();
		greeter.sayHello("Alice");
		greeter.sayHello("Bob", 30);

		// B) Method Overriding
		Animal animalRef;
		animalRef = new Dog();
		animalRef.speak();
		animalRef = new Cat();
		animalRef.speak();

		Vehicle[] vehicles = new Vehicle[] { new Car(), new Bike() };
		for (Vehicle v : vehicles) {
			v.speed();
		}

		// C) Inheritance + Polymorphism Together
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(3));
		shapes.add(new Rectangle(4, 5));
		for (Shape s : shapes) {
			System.out.println("Area: " + s.area());
		}

		Account savings = new SavingsAccount();
		Account current = new CurrentAccount();
		System.out.println("Savings interest rate: " + savings.getInterestRate() + "%");
		System.out.println("Current interest rate: " + current.getInterestRate() + "%");

		// D) Combined Overloading + Overriding
		Printer basePrinter = new Printer();
		basePrinter.print("Base text");
		basePrinter.print(123);

		Printer colorPrinter = new ColorPrinter();
		colorPrinter.print("Hello in color");
		colorPrinter.print(456);
    }
}


