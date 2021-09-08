package chapter3;

import java.util.Scanner;

/**
 * This program demonstrates how to pass 
 * multiple arguments to a method
 */

public class MultipleArgs {

	public static void main(String[] args) {
		double boxLength, boxWidth;
		
		Scanner keyboard = new Scanner(System.in);
		Rectangle box = new Rectangle();
		
		System.out.print("What is the box's length? ");
		boxLength = keyboard.nextDouble();
		
		System.out.print("What is the box's width? ");
		boxWidth = keyboard.nextDouble();
		
		box.set(boxLength, boxWidth);
		
		// Display the box's length, width, and area.
		System.out.println("The box's length is " 
							+ box.getLength());
		System.out.println("The box's width is " 
							+ box.getWidth());
		System.out.println("The box's area is " 
							+ box.getArea());
	}
}
