package chapter3;

/**
 * This program demonstrates the Rectangle class's
 * setLegth method.
 */

public class LengthDemo 
{
	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle();
		
		System.out.println("Sending the value 10.0 to " + 
						"the setLength method.");
		box.setLength(10.0);
		
		System.out.println("Sending the value 20.0 to " + 
				"the setWidth method.");
		box.setWidth(20.0);
		
		System.out.println("Done!");
	}
}
