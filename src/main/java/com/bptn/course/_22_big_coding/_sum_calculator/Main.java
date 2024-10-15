package com.bptn.course._22_big_coding._sum_calculator;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); 

		// Create two SumCalculator threads to calculate the sum of two different ranges
		SumCalculator sumCalculator1 = new SumCalculator(1, 1000000);
//		SumCalculator sumCalculator2 = new SumCalculator(50001, 1000000);

		// Start both threads
		sumCalculator1.start();
//		sumCalculator2.start();

		try {
			// Wait for both threads to finish using join() method of each thread.
			sumCalculator1.join(); 
//			sumCalculator2.join(); 
		} catch (InterruptedException e) {
			// Print the stack trace if an interruption occurs
			e.printStackTrace();
		}

		// Calculate the total sum by adding the sum of both ranges
		
		int totalSum = sumCalculator1.getSum(); 
//				+ sumCalculator2.getSum();
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime; 
//		currentTimeMillis();
//				;

		// Print the total sum
		System.out.println("Total sum: " + totalSum);
		System.out.println("Execution time: " + duration + " milliseconds");

	}

//	private static void currentTimeMillis() {
//		long currentTimeMillis = 0;
//		// TODO Auto-generated method stub
//		System.out.println("The current time is: " + currentTimeMillis );
//		
//	}

}
