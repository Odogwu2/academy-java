package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// ClassName objectName = new ClassName (); sample syntax for creating an
		// object.

		// Step 1: Declare a scanner object
		Scanner scanner = new Scanner(System.in); // System.in is a constructor

		// Step 2: create a variable to store the input
		String username = "";

		// Step 3: Read an input from the user and store it inside the variable created
		// in no.2
		System.out.println("Please enter your username: ");
		username = scanner.nextLine();

		// Step 4: Display the output to the console
		System.out.println("The username entered is: " + username);

		// Step 5: Close the scanner using the close method from the scanner class
		scanner.close();

	}
}
