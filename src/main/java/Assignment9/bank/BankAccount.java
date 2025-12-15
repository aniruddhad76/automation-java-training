package Assignment9.bank;

/**
 * Demonstrates accessibility of different access modifiers across packages.
 */
public class BankAccount {
    private double balance;
    protected String ifscCode;
    public String bankName;

    public BankAccount(double balance, String ifscCode, String bankName) {
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public void showIfscCode() {
        System.out.println("IFSC Code: " + ifscCode);
    }

    public void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

