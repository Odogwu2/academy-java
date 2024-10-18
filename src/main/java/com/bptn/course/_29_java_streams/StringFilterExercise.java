package com.bptn.course._29_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilterExercise {

	public static void main(String[] args) {
		// Declare & initialize a list a strings 
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
		
		//perform filter operation 
		//filter the strings that has letter e
		
		list.stream()
						.filter((element)-> element.contains("e"))
						.forEach(System.out::println);

	}

}
