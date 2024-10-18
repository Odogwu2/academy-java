package com.bptn.course._27_lambdas._02_lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayListLambda {
	
	public static void main (String[]args) {
		
		//declare an ArrayList
		List<String> fruits = new ArrayList<>(); 
		
		//add colors to the list. 
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("cherry");
		fruits.add("banana");
		
		//using a traditional for-each loop through the elements and print it 
//		for(String fruit : fruits) {
//			System.out.println(fruit);
//		}
		
		//this is using a Lambda expression
		fruits.forEach((fruit) -> System.out.println(fruit));
	}

}
