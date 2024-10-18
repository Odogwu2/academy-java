package com.bptn.course._29_java_streams;

import java.util.Arrays;
import java.util.List;

public class StreamExercise {

	public static void main(String[] args) {
		//create a list of strings 
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		
		//count the number of elements in the list 
		//use the stream() method to convert the list to a stream of strings 
		//use the count() terminal operation on the stream of strings 
		
		long count = words.stream()
									.count();
		
		//print the count 
		System.out.println("Count numbers of words in the list " + count);
		
		//iterate over the list and print each word using a lambda expression
		words.forEach((word)-> System.out.println(word));
		
		
		//using a method reference, transform words to UpperCase
		//map() is an intermediate operation that transforms each word to uppercase
		//collect is a terminal operation that collects the results into a list. 
		
		List<String> newList = words.stream()
												.map(String::toUpperCase)
												.toList();
		
		
		//print the list of words in uppercase
		System.out.println("Words in upper case " + newList);

	}

}
