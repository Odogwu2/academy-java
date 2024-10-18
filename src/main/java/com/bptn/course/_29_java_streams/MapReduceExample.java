package com.bptn.course._29_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		
		
		//create a list of integers
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		
		//convert it to a stream, use the map method to square all the numbers
		//print out the result to the console
		
		
		list.stream()
						.map((num)-> num * num)
						.forEach((element)-> System.out.println(element));
		
		Integer result = list.stream()
										.map((num)-> num * num)
										.reduce(0, (a,e)-> a * e);
		
		
		//sum up all the squared numbers in the previous step by using the reduce() method. 
		System.out.println("The final output is: " + result);

	}

}
