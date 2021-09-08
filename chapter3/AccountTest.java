package chapter3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		BankAccount account;
		
		double balance, interestRate, pay, cashNeeded;
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is your account's " + 
					"starting balance? ");
		balance = input.nextDouble();
		
		System.out.print("What is your monthly " + 
					"interest rate? ");
		interestRate = input.nextDouble();
		
		// Create a BankAccount object.
		account = new BankAccount(balance, interestRate);
	
		// Get the amount of pay for the month.
		System.out.print("How much were you paid this month? ");
		pay = input.nextDouble();
		
		// Deposit the user's pay into the account.
		System.out.println("We will deposit your pay " 
				+ "into your account.");
		account.deposit(pay);
		System.out.println("Your current balance is $" 
				+ account.getBalance());
		
		 // Withdraw some cash from the account.
		System.out.print("How much would you like " 
				+ "to withdraw? ");
		cashNeeded = input.nextDouble();
		account.withdraw(cashNeeded);
		
		// Add the monthly interest to the account.
		account.addInterest();
		
		// Display the interest earned and the balance.
		System.out.println("This month you have earned $" 
				+ account.getInterest()
				+ " in interest.");
		System.out.println("Now your balance is $"
				+ account.getBalance());
	}
}
