package chapter3;

public class Temperature {
	private double ftemp;
	
	public Temperature(double temp) {
		this.ftemp = temp;
	}
	
	public void setFahrenheit(double temp) {
		this.ftemp = temp;
	}
	
	public double getFahrenheit() {
		return this.ftemp;
	}
	
	public double getCelsius() {
		double celsius = (5/9) * (this.ftemp - 32);
		return celsius;
	}
	
	public double getKelvin() {
		double kelvin = ((5/9) * (this.ftemp - 23)) + 273;
		return kelvin;
	}
}
