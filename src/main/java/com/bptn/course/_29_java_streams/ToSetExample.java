package com.bptn.course._29_java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {

	public static void main(String[] args) {
		// create a list of strings

		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		
		Set<String> newSet = words.stream()
											.collect(Collectors.toSet());
		
		newSet.stream()
						.forEach(System.out::println);

	}

}
