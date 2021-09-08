package chapter3;

import java.util.Scanner;

public class RoomArea {

	public static void main(String[] args) {
		
		double number, totalArea;
		
		// Create a Scanner object to perform input to the console
		Scanner input = new Scanner(System.in);
		
		// Create three Rectangle objects
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		
		// Get and store the dimensions of the kitchen.
		System.out.print("What is the kitchen's length? ");
		number = input.nextDouble();
		kitchen.setLength(number);
		System.out.print("What is the kitchen's width? ");
		number = input.nextDouble();
		kitchen.setWidth(number);
		
		// Get and store the dimensions of the bedroom.
		System.out.print("What is the bedroom's length? ");
		number = input.nextDouble();
		bedroom.setLength(number);
		System.out.print("What is the bedroom's width? ");
		number = input.nextDouble();
		bedroom.setWidth(number);
		
		// Get and store the dimensions of the den.
		System.out.print("What is the den's length? ");
		number = input.nextDouble();
		den.setLength(number);
		System.out.print("What is the den's width? ");
		number = input.nextDouble();
		den.setWidth(number);
		
		// Calculate the total are of the rooms.
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		
		// Display the total area of the rooms.
		System.out.println("The total of the rooms is " + 
							totalArea);
	}
}
