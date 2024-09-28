package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //use of scanner class because we expect an input to the console. 

		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		//datatype variable = objectnName.Method(); 
		//the method reads the next input and assigns it to the variable "word"

		StringBuilder encrypted = new StringBuilder();
		//ClassName objectName = new ClassName(); 
		//Syntax for declaring a class object. 
		
		//initiating for loop to run through each character in the string "word"
		// initializing the variable "c" and assigning a data type "char"
		// method ".toCharArray converts the String word into a character array i.e. each element is a single character from the string. 
		
		for (char c : word.toCharArray()) {
			if (Character.isLetter(c)) {
				int myAscii =  c; 
				// casting the char "c" to an integer and assigning to asciiValue 
				// casting it is what gives the ASCII value for the character. 

				// Shifting the letter by one position
				int shiftedMyAscii = myAscii + 1;

				// Handle wrapping around from 'z' to 'a' or 'Z' to 'A'
				// checking if the ASCII value of the shiftedMyAscii is greater than the ASCII value of 'z'
				// Also setting the condition to check if the original character 'c' was a lowercase letter. 
			
				if (shiftedMyAscii > 'z' && Character.isLowerCase(c)) {
					shiftedMyAscii = 'a'; // if both conditions are true, the value of shiftedMyAscii is set to 'a'
					
				// The else condition is doing the same thing as the original if condition but the difference here is that it's checking for Uppercase. 	
				} else if (shiftedMyAscii > 'Z' && Character.isUpperCase(c)) {
					shiftedMyAscii = 'A'; // same as before, if both conditions are true, set the value to 'A'
				}

				// Convert the shiftedMyAscii value back to a character
				// unlike earlier where we type cast "int myAscii" into a char without using a (int), we need to use (char) to cast an integer to a char. 
				char encryptedChar = (char) shiftedMyAscii; // assigning the casted value to the variable 'encryptedChar'
				
				encrypted.append(encryptedChar); //using the stringBuilder class method 'append', we are appending the "encryptedchar' value to the string variable 'encrypted' 
			} else {
				encrypted.append(c); //we will be appending "c' value to the string variable 'encrypted'. This is our default condition 
			}
		}
		//String codedWord = encrypted.toString();
		System.out.println("Encrypted word: " + encrypted.toString()); //encrypted.toString() is used to transform the StringBuilder object (encrypted) to a regular String.
		scanner.close();

	}

}
