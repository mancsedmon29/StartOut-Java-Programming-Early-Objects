package chapter3;

/**
 * This program create three instances for the Rectangle
 * class and passes arguments to the constructor.
 */

import java.util.Scanner;

public class RoomConstructor 
{
	public static void main(String[] args) 
	{
		double roomLength, 
				roomWidth, 
				totalArea;
		// Declare rectangle variables to reference
		// objects for the kitchen, bedroom, and den.
		Rectangle kitchen, bedroom, den;
		
		// Create Scanner object for keyboard input.
		Scanner input = new Scanner(System.in);
		
		// Get and store the dimension of the kitchen.
		System.out.print("What is the kitchen's length? ");
		roomLength = input.nextDouble();
		System.out.print("What is the kitchen's width? ");
		roomWidth = input.nextDouble();
		kitchen = new Rectangle(roomLength, roomWidth);
		
		// Get and store the dimensions of the bedroom.
		System.out.print("What is the bedroom's length? ");
		roomLength = input.nextDouble();
		System.out.print("What is the bedroom's width? ");
		roomWidth = input.nextDouble();
		bedroom = new Rectangle(roomLength, roomWidth);
		
		// Get and store the dimensions of the den.
		System.out.print("What is the den's length? ");
		roomLength = input.nextDouble();
		System.out.print("What is the den's width? ");
		roomWidth = input.nextDouble();
		den = new Rectangle(roomLength, roomWidth);
		
		// Calculate the toal area of the rooms.
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		
		System.out.println("The total area of the room is " 
		+ totalArea);
	}
}
