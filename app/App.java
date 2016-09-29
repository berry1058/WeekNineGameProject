package com.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the D'n'D Game \n"
				+ "Would you like to play as a\n"
				+ "1. Human Wizard \n"
				+ "2. Elf Royal \n"
				+ "3. Twi'lek Jedi \n"
				+ "4. Smurf Warrior \n"
				+ "5. Turtle Ninja");
		
		boolean userInputCorrect = false;
		do
		{
		String userInput = sc.nextLine();
		
		
			switch (userInput) {
			case "1":
				//Call to HumanWizard Method here
				break;

			case "2":
				//Call to Elf Royal Method
				break;

			case "3":
				//Call to twilekJedi Methods
				break;

			case "4":
				//Call to Smurf Warrior Methods
				break;

			case "5":
				//Call to TurtleNinja Methods
				break;

			default:
				userInputCorrect = true;
				System.out.println("You've entered an incorrect choice \n"
						+ "1, 2, 3, 4, 5 are your choices. \n");
				break;
			}
		} while (userInputCorrect);
	}
	
}
