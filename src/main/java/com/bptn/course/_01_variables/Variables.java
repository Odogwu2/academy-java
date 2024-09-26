package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {

		// Declaring my two integers & assigning them values.

		int firstNumber = 10;
		int secondNumber = 2;

		// reassign the variable with a new value

		//firstNumber = 15;
		//secondNumber = 5;

		// performing addition operation and storing result in a new variable called
		// result
		int result = firstNumber + secondNumber;

		// performing subtraction operation and storing result in a new variable called
		// result1
		int result1 = firstNumber - secondNumber;

		// performing multiplication operation and storing result in a new variable
		// called result2
		int result2 = firstNumber * secondNumber;

		// performing division operation and storing result in a new variable called
		// result3
		int result3 = firstNumber / secondNumber;

		// Declaring a char (character) variable and a string variable
		char passmark = 'B';
		String name = "Udochukwu";

		// printing out sum result
		System.out.println("firstNumber - secondNumber" + ": " + result);

		// printing out subtraction result
		System.out.println("firstNumber - secondNumber" + ": " + result1);

		// printing out multiplication result
		System.out.println("firstNumber - secondNumber" + ": " + result2);

		// printing out division result
		System.out.println("firstNumber - secondNumber" + ": " + result3);

		// printing out char and string variables
		System.out.println(
				"His name is " + name + " and " + "he scored " + result2 + ", which is a grade of " + passmark + ".");

	}
}
