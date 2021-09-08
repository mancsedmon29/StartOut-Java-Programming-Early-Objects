package chapter3;

public class Payroll {
	private String employeeName;
	private int idNumber;
	private double hourlyPayRate;
	private int hoursWorked;
	private double grossPay;
	
	public Payroll(String empName,
				   int idNum,
				   double hourPay,
				   int workHours) {
		
		this.employeeName = empName;
		this.idNumber = idNum;
		this.hourlyPayRate = hourPay;
		this.hoursWorked = workHours;
	}
	
	// Mutator methods
	public void setEmployeeName(String empName) {
		this.employeeName = empName;
	}
	
	public void setIdNumber(int idNumb) {
		this.idNumber = idNumb;
	}
	
	public void setHourlyPayRate(double hourlyPay) {
		this.hourlyPayRate = hourlyPay;
	}
	
	public void setHoursWorked(int hoursWork) {
		this.hoursWorked = hoursWork;
	}
	
	// Accessor methods
	public double getGrossPay() {
		this.grossPay = this.hoursWorked * this.hourlyPayRate;
		return this.grossPay;
	}
}
