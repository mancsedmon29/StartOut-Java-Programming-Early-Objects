package chapter3;

/**
 * BankAccount class
 * This class simulates a bank account
 */

public class BankAccount {
	private double balance;
	private double interestRate;
	private double interest;
	
	/**
	 * The constructor initializes the balance
	 * and intereateRate fields with the values
	 * passed to startBalance and intRate. The
	 * interest field is assigned 0.0.
	 * @param startBalance
	 * @param intRate
	 */
	
	public BankAccount(double startBalance, double intRate) {
		balance = startBalance;
		interestRate = intRate;
		interest = 0.0;
	}
	
	/**
	 * The deposit method adds the parameter 
	 * amount to the balance field.
	 */
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	/**
	 * The withdraw method subtracts the
	 * parameter amount from the balance
	 * field.
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	/**
	 * The addInterest method adds the 
	 * interest for the month to the balance field.
	 */
	public void addInterest() {
		interest = balance * interestRate;
		balance += interest;
	}
	
	/**
	 * The getInterest method returns the 
	 * value in the interest field.
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * The getInterest method returns the 
	 * value in the interest field.
	 * @return interest
	 */
	public double getInterest() {
		return interest;
	}
}
