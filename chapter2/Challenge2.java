package chapter2;

/*
 *  2. Name and Initials
 *  
	Write a program that has the following String variables: 
	firstName, middleName, and lastName. Initialize these with 
	your first, middle, and last names. The program should also
	have the following char variables: firstInitial, middleInitial, 
	and lastInitial. Store your first, middle, and last initials in 
	these variables. The program should display the contents of these 
	variables on the screen.
 */
import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = input1.nextLine();
		
		System.out.print("Enter your middle name: ");
		middleName = input1.nextLine();
		
		System.out.print("Enter your last name: ");
		lastName = input1.nextLine();
		
		
		System.out.println("Your first name is " + firstName);
		System.out.println("Your middle name is " + middleName);
		System.out.println("Your last name is " + lastName);
	}
}
