/* Loan Account Program */
public class LoanAccount extends BankAccount {
    
    private double overdraftLimit;
    private static double currentInterestRate = 0.05; // 5%

    // Constructor
    public LoanAccount(String name, int accountNumber) {
        super(name, accountNumber);
        this.overdraftLimit = 0;
    }

    // Override of the withdraw method to allow negative balance
    @Override
    public void withdraw(double amount) {
        double newBalance = getBalance() - amount;
        if (newBalance >= -overdraftLimit) {
            setBalance(newBalance);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

	// Set method for overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Get method for overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    } 

    // Method to calculate projected interest
    public double calculateProjectedInterest() {
        if (getBalance() >= 0) {
            return 0;
        } else {
            return getBalance() * currentInterestRate;
        }
    }
}
