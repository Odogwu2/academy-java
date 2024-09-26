package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner; // pre configured utility for Scanner object. 

public class Factorial {
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in); // allowing for user input. 
		System.out.println("Enter a number to get it's factorial: "); // Prompt for user to enter value
		
		int number = scanner.nextInt(); // collect input from user and store this variable. 
		
		if (number <= 0) {
			System.out.println("Invalid entry. Please enter a positive number.");
		
}
		else {
		//scanner = new Scanner (System.in);
			/* how can i take another entry if the first condition is false 
			and I want the user to continue after returning the message
			*/ 
		//number = scanner.nextInt();
		
		int factorial = 1; 
		
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i; 
		}
		
		System.out.println ("The factorial of the number entered is: " + factorial);	
		}
		scanner.close();
	}

}
