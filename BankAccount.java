/* Bank Account Program java */
public class BankAccount {
	
    // Private member variables for name, account number, balance, amount
    private String name;
    private int accountNumber;
    private double balance;
    private double amount;

    // Constructor 
    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.amount = 0;
    }

    // Get method for name
    public String getName() {
        return name;
    }

    // Get method for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Get method for balance
    public double getBalance() {
        return balance;
    }
    
    protected void setBalance(double newBalance) {
    	this.balance = newBalance;
    }
    
    // Method for depositing funds 
    public void deposit(double amount) {
        balance += amount;
    }

    // Method for withdrawing funds 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Override of the toString() method to return a string of the account details
    @Override
    public String toString() {
        return name + ": Balance = €" + balance;
    }
}


















