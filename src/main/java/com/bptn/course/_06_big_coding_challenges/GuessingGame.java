package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //initializing the scanner object because we want to read user input.  
		
		int targetNumber = 23; // setting the integer for target number variable
		int guess; // declaring the guess variable. Variable will be used for comparison.
		
		System.out.println("Welcome!. I am thinking of a number between 1 and 100. Can you guess what number it is?");
		
		do {
			System.out.println("Enter your guess: ");
			guess = scanner.nextInt(); //User the scanner.nextInt() method allowing for user input of their guess and assigning it to the guess variable. 
			
			//using an OR operator here because guess has to be between 1 and 100. hence number less than 1 or greater than 100 is true. 
			//the OR operator, one condition has to be true. 
			if (guess < 1 || guess > 100 ) {
				System.out.println ("Please enter a number between 1 and 100."); 
			}
			else if (guess > targetNumber) {
				System.out.println ("Too high! Try again.");
			}
			else if (guess < targetNumber) {
				System.out.println ("Too low! Try again.");
			}
			//else if (guess == targetNumber)  {
				//System.out.println ("Congratulations! You guessed the number correctly!");
			//}
			else {
				System.out.println ("Congratulations! You guessed the number correctly!"); //this is our success outcome. 
			}
				
		}while (guess != targetNumber); // as long as the guess is not correct, run the do loop again. 
		scanner.close(); //close the scanner resource. 

	}

}
