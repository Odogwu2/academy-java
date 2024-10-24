package com.bptn.course._coding45_fibonacci_recursion;

public class FibonacciRecursion {

	// Recursive method to calculate the nth Fibonacci number
	public static int calculateFibonacci(int n) {
		// Base case 1: Fibonacci(0) is 0
		if (n == 0) {
			return 0; 
		}

		// Base case 2: Fibonacci(1) is 1
		else if (n == 1) {
			return 1; 
		}

		// For other values of n, calculate Fibonacci(n) recursively
		
		else {
			// Calculate Fibonacci(n - 1) using recursion
			
			int fb1 = calculateFibonacci(n - 1); 
			
			// Calculate Fibonacci(n - 2) using recursion
			
			int fb2 = calculateFibonacci(n - 2); 
			
			// Calculate Fibonacci(n) by summing the above two values
			
			return fb1 + fb2; 
			
		}

	}

	public static void main(String[] args) {
		System.out.println("First 10 Fibonacci Numbers:");

		// Loop to calculate and print the first 10 Fibonacci numbers
		for (int i = 0; i < 10; i++) {
			int result = calculateFibonacci(i);
			System.out.println("Fibonacci(" + i + ") = " + result);
		}
	}
}