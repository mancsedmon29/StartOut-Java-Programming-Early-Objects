package chapter3;

public class Car {
	private int yearModel;
	private String make;
	private int speed = 0;
	
	public Car(int yrModel, 
				String make, int speed) {
		
		this.yearModel = yrModel;
		this.make = make;
		this.speed = speed;
	}
	
	// Accessor or Getter methods
	public int accelerate() {
		this.speed += 5;
		return this.speed;
	}
	
	public int brake() {
		this.speed -= 5;
		return this.speed;
	}
}
