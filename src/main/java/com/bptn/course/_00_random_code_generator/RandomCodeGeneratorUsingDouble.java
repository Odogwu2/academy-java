package com.bptn.course._00_random_code_generator;

import java.util.Random;

public class RandomCodeGeneratorUsingDouble {

	public static void main(String[] args) {
		//Random rand = new Random();

		double randomNumber = (double) Math.random();

		// int intValue = (int) randomNumber; (Cast the double to an int)
		// using double to allow for decimal values
		// return type of the method which determines what data type the variable will
		// be
		// Math.random generates a random number
		// datatype variableName = objectName.method();

		System.out.println("After execution the Random number is: " + randomNumber);

	}

}
