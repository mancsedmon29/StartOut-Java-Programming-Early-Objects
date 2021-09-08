package chapter3;

import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {
		// Variables for tests
		String testMan, testMod;
		double testPrice;
		
		Scanner input = new Scanner(System.in);
		
		// Get the manufacturer's name.
		System.out.print("Enter the manufacturer: ");
		testMan = input.nextLine();
		
		// Get the model number
		System.out.print("Enter the model number: ");
		testMod = input.nextLine();
		
		// Get the retail price
		System.out.print("Enter the retail price: ");
		testPrice = input.nextDouble();
		
		// Create the Cellphone class object
		CellPhone phone = new CellPhone(testMan, testMod, testPrice);
		
		// Get the date from the phone and display it.
		System.out.println();
		System.out.println("Here is the data taht you provided:");
		System.out.println("Manufacturer: " + phone.getManufact());
		System.out.println("Model Number: " + phone.getModel());
		System.out.println("Retail Price: " + phone.getRetailPrice());
	}
}
