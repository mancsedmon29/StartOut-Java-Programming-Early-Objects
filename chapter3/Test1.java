package chapter3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		double temperatureF;
		Temperature temp1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Fahrenheit: ");
		temperatureF = input.nextDouble();
		temp1 = new Temperature(temperatureF);
		
		System.out.println("The " + temp1.getFahrenheit() 
						+ " degree Fahrenheit.");
		System.out.println("The " + temp1.getCelsius() 
						+ " degree Celsius.");
		System.out.println("The " + temp1.getKelvin() 
						+ " degree Kelvin.");
		
	}
}
