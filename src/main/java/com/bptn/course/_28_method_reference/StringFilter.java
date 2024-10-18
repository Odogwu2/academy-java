package com.bptn.course._28_method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilter {

	public static void main(String[] args) {
		
		//Declare and initialize a list of strings 
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry")); 
		
		//Declare and initialize a character to filter out. 
		char c = 'e';
		
		//printing the list before filtering.
		System.out.println("List before filtering: " + list);
		
		//print the strings using the method reference. 
		list.forEach(System.out::println);
		
		
		//using the removeIf method of the list to remove elements that contain the given character
		list.removeIf((letter) -> letter.indexOf(c)!= -1);
		
		//printing the list after filtering 
		System.out.println("List after filtering: " + list);

	}

}
