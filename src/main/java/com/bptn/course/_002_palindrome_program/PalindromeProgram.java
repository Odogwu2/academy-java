package com.bptn.course._002_palindrome_program;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string to check for palindrome: ");
			
		String input = scanner.nextLine();
			
		String reverseInput = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			//reverseInput += input.charAt(i);
			reverseInput = reverseInput + input.charAt(i);
		}

		if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
			System.out.println("Input string is palindrome");
		} else {
			System.out.println("Input string is not a palindrome");
		}
		scanner.close();

	}

}


/*Declare a variable to receive user input
Store the reverse of the input string in another variable
Compare the values of both variables.
If they are the same, print “Input string is palindrome”
Otherwise, print “Input string is not palindrome”
*/