package com.bptn.course._02_scanner;

import java.util.Scanner;

public class UserInformation {

	public static void main(String[] args) {
		// Step 1: Create an object from the scanner class.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name, Favorite city, Age, and Salary");

		// name -> String datatype
		// favorite city -> String datatype
		// age -> int datatype
		// salary -> double datatype

		// Step 2: Read the input from the user and store it inside the variables.

		String name = scanner.nextLine();
		String favCity = scanner.nextLine();
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();

		System.out.println("Name: " + name);
		System.out.println("Favorite city: " + favCity);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		// Step 3: Print the variables to the console

		// Step 4: Close the scanner
		scanner.close();

	}

}
