package chapter3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String name, department, position;
		int idNum;
		
		Scanner input = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		// For employee 1 (e1) data
		System.out.print("Enter your full name: ");
		name = input.next();
		e1.setName(name);
		System.out.print("Enter your id number: ");
		idNum = input.nextInt();
		e1.setidNumber(idNum);
		System.out.print("Enter your department: ");
		department = input.next();
		e1.setDepartment(department);
		System.out.print("Enter your position: ");
		position = input.next();
		e1.setPosition(position);
		
		// For employee 2 (e2) data
		System.out.print("Enter your full name: ");
		name = input.next();
		e2.setName(name);
		System.out.print("Enter your id number: ");
		idNum = input.nextInt();
		e2.setidNumber(idNum);
		System.out.print("Enter your department: ");
		department = input.next();
		e2.setDepartment(department);
		System.out.print("Enter your position: ");
		position = input.next();
		e2.setPosition(position);
		
		// For employee 3 (e3) data
		System.out.print("Enter your full name: ");
		name = input.next();
		e3.setName(name);
		System.out.print("Enter your id number: ");
		idNum = input.nextInt();
		e3.setidNumber(idNum);
		System.out.print("Enter your department: ");
		department = input.next();
		e3.setDepartment(department);
		System.out.print("Enter your position: ");
		position = input.next();
		e3.setPosition(position);
		
		// Display all the results.
		System.out.println("Name\t\tID Number\t\tDepartment\t\tPosition");
		System.out.println(e1.getName() + "\t\t" + e1.getId() + "\t\t" + e1.getDepartment() + "\t\t" + e1.getPosition());
		System.out.println(e2.getName() + "\t\t" + e2.getId() + "\t\t" + e2.getDepartment() + "\t\t" + e2.getPosition());
		System.out.println(e3.getName() + "\t\t" + e3.getId() + "\t\t" + e3.getDepartment() + "\t\t" + e3.getPosition());
	}
}
