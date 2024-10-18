package com.bptn.course._29_java_streams;

import java.util.Arrays;
import java.util.List;

public class StringSorter {

	public static void main(String[] args) {
		
		//create a list of strings 
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		
		//convert the list to a stream, then sort in ascending order
		//convert it back to a list and print it out
		
		List<String> newList = words.stream()
												.sorted((a,b)-> a.compareTo(b))
												
												.toList();
		
		System.out.println("Print the list: " + newList);
		
		//convert the list to a stream, then sort it in descending order 
		//print it out 
		
		words.stream()
						.sorted((a,b)-> b.compareTo(a))
						.forEach(System.out::println);

	}

}
