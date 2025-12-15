package Assignment9.customer;

import Assignment9.bank.BankAccount;

/**
 * Demonstrates access without inheritance. Uncommenting the marked lines will
 * lead to compile-time errors due to access modifier restrictions.
 */
public class BranchCustomer {

    public void demonstrateAccessWithoutInheritance() {
        BankAccount account = new BankAccount(1500.0, "IFSC0001", "Sample Bank");

        System.out.println("Public field accessible: " + account.bankName);

        // account.ifscCode = "NEWIFSC"; // Not accessible: protected in different package
        // account.balance = 2000;       // Not accessible: private member

        account.showBankName();  // Accessible: public method
        account.showBalance();   // Accessible: public method
        account.showIfscCode();  // Accessible: public method despite protected field
    }
}

