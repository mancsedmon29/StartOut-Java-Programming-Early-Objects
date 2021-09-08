package chapter3;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public void setDescription(String desc) {
		description = desc;
	}
	
	public void setUnitsOnHand(int unit) {
		unitsOnHand = unit;
	}
	
	public void setPrice(double prc) {
		price = prc;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getUnitsOnHand() {
		return unitsOnHand;
	} 
	
	public double getPrice() {
		return price;
	}
}
