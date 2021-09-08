package chapter3;
/**
 * Class Sample program: Circle
 * @author Edmon Mancao
 *
 */
public class Circle {
	private double radius;
	private final double PI = 3.14159;
	
	/**
	 * Accepts the radius of the circle as an argument.
	 * @param rad.
	 */
	public Circle(double rad) {
		this.radius = rad;
	}
	
	/**
	 *  A setRadius mutator method for the radius field.
	 * @param rad.
	 */
	public void setRadius(double rad) {
		this.radius = rad;
	}
	
	/**
	 * An accessor method for the radius field.
	 * @return radius.
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * Returns the area of the circle, which is calculated as 
	 * area = PI * radius * radius.
	 * @return area
	 */
	public double getArea() {
		double area = PI * this.radius;
		return area;
	}
	
	/**
	 * Returns the diameter of the circle, which is calculated as 
	 * diameter = radius * 2
	 * @return diameter
	 */
	public double getDiameter() {
		double diameter = this.radius * 2;
		return diameter;
	}
	
	/**
	 * Returns the circumference of the circle, which is calculated as 
	 * circumference = 2 * PI * radius
	 * @return circumference
	 */
	public double getCircumference() {
		double circumference = 2 * PI * radius;
		return circumference;
	}
}
