package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class StringPluralizer {

	public static void main(String[] args) {
		
		//Initialize the scanner method
		//Ask the user to enter a number 
		//number must be a +ve value 
		//Ask the user to enter a word 
		
		Scanner scanner = new Scanner(System.in); // Initializing scanner object to read input from the user. 
		
		int num = 0; // declaring variable for number value to be entered by the user. 
		String word; // declare variable for the word object to be entered by the user. 
		String endsWithY = "ies"; //new characters to be added when words end with "y" (after y is removed from the original string) 
		String endsWithFe = "ves"; //new characters to be added when words end with "fe" (after fe is removed from the original string)
		String endsWithUs = "i"; //new characters to be added when words end with "us" (after us is removed from the original string)
		
		
		System.out.println ("Enter a number: "); //first message on the console 
		num = scanner.nextInt(); //scanner will read the integer input from the user and store it in amount. 
		
		if (num < 0) {
			System.out.println ("Enter zero or a positive number"); //return message if the user enters a value less than 0
			return; // break point to end the program since number is not zero or a positive value. 
		}
		
		
		scanner.nextLine(); //ensuring that the subsequent nextLine() reads the actual word input.
		System.out.println ("Enter a word: "); 
		word = scanner.nextLine(); //reads the string and stores the input in "word"
		
		//here is where we begin the pluralization logic. 
		if (num == 1) //checks if the number is 1. 
		{ 
			System.out.println(num + " " + word); 
			//since the input is 1, there's no need to pluralize the word. 
			//Return the number entered and the word. The empty quote is a space. 
			
		} else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) //creating our condition for special cases 
			//using an OR operation. Only one condition has to be true for this action to happen 
			//and a endsWith(String suffix) method of the string class. This checks the letters specified in the (String suffix)
		{
			System.out.println(num + " " + word + "s"); //concatenating the number inputed with the word and adding an 's' . 
			//Here we have not removed any character from the word entered. 
			
		/*else if (amt >= 0 && word.endsWith("y")) {
			//String modifiedForY = word.substring(0, word.length() -1) + endsWithY; 
			//System.out.println(amt + " " +modifiedForY);
			
			//else (amt >= 0 && word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
			//System.out.println(amt + " " + "s");	
			 */
			
		} else if (word.endsWith("y")) {
			String modifiedForY = word.substring(0, word.length() -1) + endsWithY; //using the substring method of the string class to index characters in a string 
			//This part creates a new substring from word, starting from index 0 (the first character) to the index word.length() - 1 (which is the index of the last character).
			//This is a method used to remove the last character of the string word and then we append the string variable "endsWithY. 
			System.out.println(num + " " + modifiedForY);
			
		} else if (word.endsWith("fe")) {
			String modifiedForFe = word.substring(0, word.length() -2) + endsWithFe; 
			//By subtracting 2 here, we are creating a new substring that removes the last two characters from the string "word".
			//We then assign this new word to modifiedForFe variable. 
			System.out.println(num + " " + modifiedForFe);
			
		} else if (word.endsWith("us")) {
			String modifiedForUs = word.substring(0, word.length() -2) + endsWithUs; 
			//By subtracting 2 here, we are creating a new substring that removes the last two characters from the string "word".
			//We then assign this new word to modifiedForUs variable. 
			System.out.println(num + " " + modifiedForUs);
			
		} else if (word.endsWith("sh")) //as with previous steps, using a method in the String class, we are checking if the current string (in this case, word) ends with the specified suffix 
			//which is "sh" in this context. 
		
		{
			String modifiedForSh = word + "es"; //and we add es to the word. 
			System.out.println(num + " " + modifiedForSh);
			
		} else if (word.endsWith("ch")) {
			String modifiedForCh = word + "es"; 
			System.out.println(num + " " + modifiedForCh);
			
		} else {
			System.out.println (num + " " + word + "s"); //our default condition is set here. 
		}
		scanner.close();
		

	}

}



//} else if (amt < 0){
//System.out.println ("Enter zero or a positive number"); 
//} else if (amt >= 0) {
//System.out.println (amt + " " + word + "s"); 

//if (amt < 0) {
	//System.out.println("Please enter a zero or positive number.");
//} 