package Assignment4;

/**
 * Problem 14: BankAccount class
 * Fields: 'accountNumber', 'balance'.
 * Methods: 'deposit()', 'withdraw()'.
 * Demonstrate deposit and withdraw with an object.
 */
public class BankAccount {
    // Fields
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        } else {
            System.out.println("Insufficient funds. Available balance: $" + balance);
        }
    }
    
    // Method to get current balance
    public double getBalance() {
        return balance;
    }
    
    // Method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public static void main(String[] args) {
        // Create bank account object
        BankAccount account = new BankAccount("ACC123456", 1000.0);
        
        System.out.println("Bank Account Demo:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());
        System.out.println();
        
        // Demonstrate deposit
        account.deposit(500.0);
        account.deposit(200.0);
        
        // Demonstrate withdraw
        account.withdraw(300.0);
        account.withdraw(1500.0); // This should fail due to insufficient funds
        
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
