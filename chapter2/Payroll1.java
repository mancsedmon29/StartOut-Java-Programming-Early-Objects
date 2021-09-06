package chapter2;

import java.util.Scanner;

public class Payroll1 {

	public static void main(String[] args) {

		String name; 		// To hold user's name
		int hours;			// Hours worked
		double payRate;		// Hourly pay rate
		double grossPay;	// Gross pay
		
		// Create a Scanner object to perform input
		Scanner input = new Scanner(System.in);
		
		// Get the user's name
		System.out.print("What is your name? ");
		name = input.nextLine();
		
		// Get the number of hours worked this week.
		System.out.print("How many hours did your work this week? ");
		hours = input.nextInt();
		
		// Get the user's hourly pay rate
		System.out.print("What is yor hourly pay rate? ");
		payRate = input.nextDouble();
		
		// Calculate the gross pay.
		grossPay = hours * payRate;
		
		System.out.println("Hello " + name);
		System.out.println("Your gross pay is $" + grossPay);
	}
}
