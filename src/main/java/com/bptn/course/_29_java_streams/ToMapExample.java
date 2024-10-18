package com.bptn.course._29_java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapExample {

	public static void main(String[] args) {
		
		//create a list of strings 
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		
		Map<String, Integer> newMap = words.stream()
														.collect(Collectors
														.toMap((word)->word.toUpperCase(), (word)-> word.length()));
		
		Map<String, Integer> newMap1 = words.stream()
														.collect(Collectors
														.toMap(String::toUpperCase,String::length));
		
		System.out.println("New Map: " + newMap);
		
		System.out.println("New Map: " + newMap1);

	}

}
