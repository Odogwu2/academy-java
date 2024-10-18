package com.bptn.course._29_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLengthCountExercise {

	public static void main(String[] args) {
		
		//declare & initialize a list of strings 
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
		int length = 5; 
		
		//1. convert the list to a stream 
		//2. filter operation for words with length greater than 5
		//3. count operation 
		
		long count = list.stream()
									.filter((element)-> element.length() > length)
									.count(); 
		
		System.out.println("Number of elements after filtering: " + count);

	}

}
