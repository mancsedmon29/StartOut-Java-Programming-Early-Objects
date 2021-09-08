package chapter3;

import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {
		String name;
		String type;
		int age;
		
		Pet pet1 = new Pet();
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("What is the name if your animal: ");
		name = input.nextLine();
		pet1.setName(name);
		System.out.print("Type of animal: ");
		type = input.nextLine();
		pet1.setType(type);
		System.out.print("Age of animal: ");
		age = input.nextInt();	
		pet1.setAge(age);
		
		System.out.println();
		System.out.println("Name of animal : " + pet1.getName());
		System.out.println("Type of animal : " + pet1.getType());
		System.out.println("Age of animal  : " + pet1.getAge());
	}
}
