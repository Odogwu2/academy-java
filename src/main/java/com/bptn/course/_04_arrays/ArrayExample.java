package com.bptn.course._04_arrays;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		//declare and initialize an array
		
		int[] myArray = {3, 1, 6, 2, 10}; 
		
		//Print the first and second element to the console.
		System.out.println (myArray[0]);
		
		System.out.println (myArray[2]);
		
		//Update the first element in the array to 30 
		//myArray[0] = 30; 
		
		//System.out.println ("Updates first element: " + myArray[0]);
		
		//Updating the last element of the array using length property (without the index) & set it to 130
		myArray[myArray.length-1] = 20; 
		System.out.println(myArray[myArray.length -1]);
		
		//for loop to print values in the array 
		//traditional for loop 
		
		for (int i = 0; i < myArray.length; i++ ) {
			System.out.println(myArray[i]);
		}
		
		for (int i = myArray.length-1; i>=0; i--) {
			System.out.println (myArray[i]);
		}
		
		//enhanced for loop (for-each loop)
		for (int element: myArray)
		{
			System.out.println (element);
		}
		
		//print out the array and its element without the for loop 
		System.out.println(Arrays.toString(myArray));
		
		

	}

}
