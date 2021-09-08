package chapter3;

public class PersonalInformation {
	private String name, address, phone;
	private int age;
	
	// Mutator methods
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setPhone(String p) {
		phone = p;
	}
	
	public void setAge(int age) {
		
	}
	
	// Accessor methods
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getAge() {
		return age;
	}
}
