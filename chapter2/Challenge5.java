package chapter2;

/*
    5. Cookie Calories 
     
	A bag of cookies holds 40 cookies. The calorie information on the 
	bag claims that there are 10 servings in the bag and that a serving 
	equals 300 calories. Write a program that lets the user enter the 
	number of cookies he or she actually ate and then reports the number of
	total calories consumed.
	
	My formula
	if 40 cookies = 10 servings
	   50 cookies = ?
	
	if 1 serving = 300 calories
	   0.5 serving = ?
 */

import javax.swing.JOptionPane;

public class Challenge5 {
	
	public static void main(String[] args) {
		String inputString;
		double numberOfCookies;
		double numberOfServing;
		double numberOfCalories;
		
		inputString = JOptionPane.showInputDialog("Type the number of cookies "
				+ " you eat: ");
		numberOfCookies = Double.parseDouble(inputString);
		numberOfServing = (numberOfCookies / 40) * 10;
		numberOfCalories = (numberOfServing / 1) * 300;
		
		System.out.println("You ate " + (int)numberOfCookies + " cookies.");
		System.out.println("The calories you get is " + numberOfCalories +
		(numberOfCalories == 0 || numberOfCalories == 1? " calorie." : " calories"));
	}
}
