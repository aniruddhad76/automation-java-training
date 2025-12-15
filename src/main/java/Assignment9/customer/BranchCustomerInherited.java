package Assignment9.customer;

import Assignment9.bank.BankAccount;

/**
 * Demonstrates access when BranchCustomer inherits from BankAccount.
 */
public class BranchCustomerInherited extends BankAccount {

    public BranchCustomerInherited(double balance, String ifscCode, String bankName) {
        super(balance, ifscCode, bankName);
    }

    public void demonstrateAccessWithInheritance() {
        // balance;            // Still not accessible: private in superclass
        System.out.println("Protected IFSC accessible via inheritance: " + ifscCode);
        System.out.println("Public bank name accessible: " + bankName);

        showBalance();
        showIfscCode();
        showBankName();
    }
}

