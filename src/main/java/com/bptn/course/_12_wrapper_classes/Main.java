package com.bptn.course._12_wrapper_classes;

public class Main {

	public static void main(String[] args) {
		// Autoboxing: converting a primitive datatype into Wrapper class. int->Integer
		Integer intObject = Integer.valueOf(100); 
		
		//alternatively, we can also convert primitive type to Wrapper class using below syntax.
		Integer intObject1 = 20; //more preferred, it's short and concise. 
		
		//Unboxing: process of converting a Wrapper class into a primitive type. 
		int intPrimitive = intObject; //more preferred because its short and concise. 
		
		//alternatively, we can convert Wrapper class back to primitive type using below syntax. 
		int Primitive1 = intObject1.intValue();

	}

}


//1. Autoboxing: converting a primitive type into a Wrapper class. 
//2. unboxing is the reverse of auto boxing 
//3. the practical application of wrapper class is it's used in java collections and java generics