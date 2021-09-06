package chapter2;

/*
 * 3. Personal Information
   
   Write a program that displays the following information, each on a 
   separate line:
   
		* Your name
		* Your address, with city, state, and ZIP
		* Your telephone number
		* Your college major
		
   Although these items should be displayed on separate output lines, 
   use only a single println statement in your program.
 */

public class Challenge3 {

	public static void main(String[] args) {
		String name;
		String address, city, state, ZIP;
		String telephoneNum;
		String collegeMajor;
		
		name = "Edmon Mancao";
		address = "1029 Padre Paredes St.";
		city = "Sampaloc";
		state = "Manila";
		telephoneNum = "02345-9934";
		ZIP = "1008";
		collegeMajor = "Computer Engineering.";
		
		System.out.println(name + "\n" + address + "\n" + city + 
				"\n" + state + "\n" + ZIP + "\n" + collegeMajor + 
				"\n" + telephoneNum);
	}
}
