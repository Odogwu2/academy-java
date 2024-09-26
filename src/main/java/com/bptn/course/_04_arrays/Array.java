package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		// Declaring an array and store 5 int values inside it.
		int[] myArray = { 10, 20, 30, 40, 50 };

		// another way to declare arrays:
		// int[] myArray = new int [5];

		// the first element of the array is accessed using index=0

		System.out.println("The first element is: " + myArray[0]);

		System.out.println("The length of the array is: " + myArray.length);

		// Access the last element using the length and not the index
		System.out.println("The last element is: " + myArray[myArray.length - 1]);

		// Update the element at the first index
		myArray[0] = 100;

		System.out.println("The updated first element is: " + myArray[0]);

	}
}
