package Assignment9;

/**
 * Demonstrates method overloading for compile-time polymorphism.
 */
public class PaymentProcessor {

    public void processPayment(int amount) {
        System.out.println("Processing integer amount: " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Processing amount with currency: " + amount + " " + currency);
    }

    public void processPayment(String upiId) {
        System.out.println("Processing UPI payment for: " + upiId);
    }
}

