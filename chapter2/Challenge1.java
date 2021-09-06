package chapter2;

/* 1. Name, Age, and Annual Income
 *  Write a program that declares the following:
 
		- a String variable named name
		- an int variable named age
		- a double variable named annualPay
	
	Store your age, name, and desired annual income as literals in these variables. The program
 	should display these values on the screen in a manner similar to the following:
	
			My name is Joe Mahoney, my age is 26 and
			I hope to earn $100000.0 per year.
 */
import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		String name;
		int age;
		double annualPay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		name = input.nextLine();
		
		System.out.print("What is your age? ");
		age = input.nextInt();
		
		System.out.print("What is your annual Pay? ");
		annualPay = input.nextDouble();
		
		System.out.println("\nMy name is " + name + ", my age is " + age + 
							" and\n I hope to earn $" + annualPay + " per year.");
		
	}
}
