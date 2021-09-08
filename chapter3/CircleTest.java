package chapter3;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		double radius;
		Scanner input = new Scanner(System.in);
		Circle c1;
		
		System.out.print("Enter the value of radius: ");
		radius = input.nextDouble();
		c1 = new Circle(radius);
		
		System.out.println();
		System.out.printf("The area is %.2f\n", c1.getArea());
		System.out.printf("The diameter is %.2f\n", c1.getCircumference());
		System.out.printf("The circumference is %.2f\n", c1.getCircumference());
	}
}
