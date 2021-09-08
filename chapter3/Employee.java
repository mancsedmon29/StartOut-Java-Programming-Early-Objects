package chapter3;

public class Employee {
	private String name, department, position;
	private int idNumber;
	
	/**
	 * Para mai-set ang buong pangaalan ng isang tao
	 * sa loob ng method na ito.
	 * @param name
	 */
	public void setName(String name) {
		name = name;
	}
	
	/**
	 * Para mai-set and numero ng ID sa loob ng method 
	 * na ito.
	 * @param id
	 */
	public void setidNumber(int id) {
		idNumber = id;
	}
	
	/**
	 * Sa pamamagitan ng method na ito, para mai-set
	 * ang pangalan ng department papunta sa field
	 * variable.
	 * @param dept
	 */
	public void setDepartment(String dept) {
		department = dept;
	}
	
	/**
	 * Sa pamamagitan ng method na ito, para mai-set
	 * ang pangalan ng position papunta sa field
	 * variable.
	 * @param pos
	 */
	public void setPosition(String pos) {
		position = pos;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
}
