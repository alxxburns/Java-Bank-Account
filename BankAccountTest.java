/* Bank Account Test Program */
public class BankAccountTest {
	
    public static void main(String[] args) {
    	
        // Create two BankAccount objects
        BankAccount account1 = new BankAccount("Alex Burns", 3232);
        BankAccount account2 = new BankAccount("Shane O Leary", 67890);

        // Deposit money in both accounts
        account1.deposit(500);
        account2.deposit(1000);

        // Withdraw some money from account1
        account1.withdraw(200);

        // Display account details using toString()
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}