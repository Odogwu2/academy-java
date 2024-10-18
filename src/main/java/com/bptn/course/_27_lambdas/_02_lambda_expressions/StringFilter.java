package com.bptn.course._27_lambdas._02_lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilter {
	public static void main(String[] args) {
		// Declare and initialize a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry")); 

		// Declare and initialize a character to filter out
		char c = 'e';
		
		// Print the list before filtering
		System.out.println("List before filtering: " + list);

		// Use the removeIf method of the list to remove elements that contain the given
		// character
		// The removeIf method takes a lambda expression as a parameter, which specifies
		// the condition for removing the element
		list.removeIf((color)-> color.indexOf(c)!= -1);
		
		/*
		 * The indexOf method in the lambda expression checks that the index of the character in the String is not equal to -1, 
		 * which would mean that the character is not present in the string. 
		 * E.g., if we don’t get -1, the character is present, and we should then remove 
		 * the element from the ArrayList.
		 * 
		 */

		// Print the list after filtering
		System.out.println("List after filtering: " + list);
	}
}