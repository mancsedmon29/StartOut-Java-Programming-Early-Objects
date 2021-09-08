package chapter3;

/**
 * The Cellphone class represents an cell phone.
 * @author Edmon Mancao
 * @implNote This is a sample class program about cell phone.
 */

public class CellPhone 
{
	// Fields
	private String manufact;
	private String model;
	private double retailPrice;
	
	/**
	 * The constructor accepts arguments for
	 * the phone's manufacturer, model number,
	 * and the price.
	 * @param man
	 * @param mod
	 * @param price
	 */
	public CellPhone(String man, String mod, double price) {
		manufact = man;
		model = mod;
		retailPrice = price;	
	}
	
	/**
	 * The setManufact method acdepts an argument for
	 * the phone's manufacturer name.
	 * @param man
	 */
	public void setManufact(String man) {
		manufact = man; // or manufact = man;
	}
	
	/**
	 * The setModelNumber method accepts an argument 
	 * for the phone's model number
	 * @param mod
	 */
	public void setModel(String mod) {
		model = mod; // or model = mod
	}
	
	/**
	 * The setRetailPrice method accepts an argment 
	 * for the phone's retail price.
	 * @param price
	 */
	public void setRetailPrice(double price) {
		retailPrice = price;
	}
	
	/**
	 * The getManufact method returns the name of 
	 * the phone's manufacturer.
	 * @return manufact
	 */
	public String getManufact() {
		return manufact;
	}
	
	/**
	 * The getModel method returns the phone's
	 * model number.
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * The getRetailPrice method returns the 
	 * phone's retail price.
	 * @return retailPrice
	 */
	public double getRetailPrice() {
		return retailPrice;
	}

}
