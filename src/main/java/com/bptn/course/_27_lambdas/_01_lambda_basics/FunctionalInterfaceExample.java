package com.bptn.course._27_lambdas._01_lambda_basics;

/*
 * Functional Interface has only ONE abstract method (SAM)
 */

@FunctionalInterface
interface A{
	
	//abstract method (a method that has no implementation. 
	void print(); 
}

@FunctionalInterface 
interface C{
	
	//another abstract method (a method that has no implementation
	String display (String name); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// We cannot have objects from the functional interface 
		// we are implementing the SAM (Single Abstract Method) by using anonymous inner class
		// if we have a block of code within a lambda, it's represented within the curly brace & semicolon at the end 
		// the parameter type may or may not be mentioned. 
		
		A myObj = ()-> System.out.println("Hello World");
		myObj.print();
		
		
		
		//without the return keyword, it does NOT throw an error as the compiler knows you are returning a value 
		// passing the input type in the parameter is optional 
		// passing the same number of parameters as how it's defined in the interface is important. 
		
		C myObj1 = (name)-> "Hello " + name; 
		
		System.out.println(myObj1.display("Udo"));

	}

}
