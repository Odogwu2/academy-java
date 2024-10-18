package com.bptn.course._29_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumberList {

	public static void main(String[] args) {
		
		//create list of integers 
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 
		
		//use the stream method to convert the list to a stream of integers 
		//then use the filter method to keep only the even numbers in the stream
		//finally use the toList() method to convert the filtered stream back into a list of integers 
		
		List<Integer> evenList = list.stream()
											.filter((num)-> num % 2==0)	
											.toList();
		
		//print the original list and the new list that contains only the even numbers. 
		System.out.println("Original list: " + list);
		System.out.println("Even numbers list: " + evenList);
		

	}

}

//filter method has a predicate which is a functional interface and SAM boolean test(T t) 
//filter() is an intermediate operation and forEach is a terminal operation 

