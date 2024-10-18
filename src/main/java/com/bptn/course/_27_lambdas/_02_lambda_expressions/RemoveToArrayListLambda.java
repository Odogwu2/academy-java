package com.bptn.course._27_lambdas._02_lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class RemoveToArrayListLambda {

	public static void main(String[] args) {
		
		
		//declare an ArrayList 
		List<String> colors = new ArrayList<>(); 
		
		//add elements 
		colors.add("red"); 
		colors.add("purple");
		colors.add("black");
		colors.add("white");
		colors.add("yellow");
		
		//print all the elements using a traditional for-each loop 
		for(String color : colors) {
			System.out.println(color);
		}
		
		//using for-each with Lambda syntax 
		colors.forEach((color)-> System.out.println(color));
		
		//using removeIf() using Lambda syntax 
		colors.removeIf((color)-> color.equals("yellow"));
		
		colors.forEach((color)-> System.out.println(color));

	}

}
