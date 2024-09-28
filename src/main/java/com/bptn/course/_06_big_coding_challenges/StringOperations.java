package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		String str1, str2;

		do {
			// Display menu
			System.out.println("\nString Operations Menu: \n1. Check if the word is a palindrome \n2. Reverse the word \n3. Concatenate two words \n4. Compare two words \n5. Calculate the length of the word \n6. Exit");
			System.out.println("Enter your choice: ");
			
			choice = scanner.nextInt(); //declaring that the integer entered next is the choice. 
			scanner.nextLine(); // Read any newline character after a choice is made. Here its reading the word to perform the cases. 

			switch (choice) {
			case 1:
				// Check if the string is a palindrome
				System.out.print("Enter the word to check for palindrome: ");
				str1 = scanner.nextLine(); //assigning whatever word is typed in the console to str1. 
				String reversed = new StringBuilder(str1).reverse().toString(); 
				//now we have data in str1 variable to use in the string builder method. 
				//toString is used here to convert the reversed StringBuilder to a string before assigning it to the variable we're declaring "reversed".
				
				//now doing a comparison
				//using the .equals because we are comparing two strings (using == wont work). 
				if (str1.equals(reversed)) {
					System.out.println("The string is a palindrome.");
				} else {
					System.out.println("The string is not a palindrome.");
				}
				break; //using a break statement here because once the outcome is met, no need to run through the others. 

			case 2:
				// Reverse the string
				System.out.print("Enter the word to reverse: ");
				str1 = scanner.nextLine();
				String reverseString = new StringBuilder(str1).reverse().toString();
				//this is very similar to case one, the only difference is we are not comparing the reversed word with str1
				//we are just printing it out. 
				System.out.println("Reversed string: " + reverseString);
				break;

			case 3:
				// Concatenate two strings
				System.out.print("Enter the first word: ");
				str1 = scanner.nextLine();
				System.out.print("Enter the second word: ");
				str2 = scanner.nextLine();
				String concatenatedString = str1+str2; 
				//pretty straight forward logic to take the two words and using the + sign between them. 
				System.out.println("Concatenated string: " + concatenatedString);
				break;

			case 4:
				// Compare two strings
				System.out.print("Enter the first word to compare: ");
				str1 = scanner.nextLine();
				System.out.print("Enter the second word to compare: ");
				str2 = scanner.nextLine();
				int comparisonResult = str1.compareTo(str2); // 
				if (comparisonResult == 0) {
					System.out.println("The word are equal.");
				} else if (comparisonResult > 0) {
					System.out.println("The first word is greater.");
				} else {
					System.out.println("The second word is greater.");
				}
				break;

			case 5:
				// Calculate the length of a string
				System.out.print("Enter the word to calculate its length: ");
				str1 = scanner.nextLine();
				int length = str1.length(); //method in the string class to calculate the length of a word. 
				System.out.println("Length of the word: " + length);
				break;

			case 6:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice! Please choose a valid option."); 
				//adding a default statement which acts as a else where if no condition is met, do this. 
			}
		} while (choice != 6); 

		scanner.close();

	}

}
