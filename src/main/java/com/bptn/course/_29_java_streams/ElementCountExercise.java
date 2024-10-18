package com.bptn.course._29_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementCountExercise {
	

	public static void main(String[] args) {
		
		
		//Declare & initialize a list of strings. 
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
		
		//looping through the ArrayList using Lambda expression
		//list.forEach((element)-> System.out.println(element));
		
	
		//1. convert the list to a stream using the stream() method 
		//2. Use forEach() method on the stream to perform a terminal operation 
		
		list.stream()
					.forEach((element)-> System.out.println(element));
		
		
		
		//1. convert the list to a stream using the stream() method. 
		//2, count the number of elements in the stream (terminal operation) 
		
		long count = list.stream()
									.count(); 
		
		System.out.println("The number of elements: " + count);
		

	}

}


// forEach method is a terminal operation which means we cannot perform any more operations after a terminal operation 
// we cannot reuse a stream once the operation is completed in the stream.
// we can perform intermediate or terminal operations in the stream. 
