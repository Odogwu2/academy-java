package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

public class FibonacciUserInput {

	public static void main(String[] args) {
		
		// Initialize the Scanner Object
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: "); // call to action message displayed to the user.

		// Fetch the input from the user and store in the variable called n
		int n = scanner.nextInt();

		int first = 0; // First element of Fibonacci series
		int second = 1; // Second element of Fibonacci series
		int third; // 3rd element of Fibonacci series

		System.out.print("Fibonacci Series up to " + n + " elements: "); // printing out the message preceding the final result.
		

		// Print the first n elements of Fibonacci series
		for (int i = 0; i < n; i++) {
			System.out.print(first + " "); // output message on the same line
			
			third = first + second; // the 3rd number in a fibonacci series is a sum of the 1st & 2nd

			first = second; 
			/* reassigning the first value with the second because on each iteration
			its the 2nd to the last number that becomes the first number */
			second = third; 
			/* reassigning the second value with the third because on each iteration,
			the 'third" on each iteration becomes the 2nd number needed. */

		}

		scanner.close(); // closing out the scanner resource.

	}

}
