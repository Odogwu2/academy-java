package com.bptn.course._08_polymorphism;

public class Polymorphism3 {
	
	void print(int integer) {
		
		System.out.println("Printing an integer: " + integer); 
	}
	
	void print(String word) {
		System.out.println ("Printing a string: " + word);
	}
	
	int print(int a, int b) {
		return a+b; 
	}
	
	double print(double a, double b) {
		return a+b; 
		
	}

	public static void main(String[] args) {
		//creating a new object from Polymorphism3 class 
		
		Polymorphism3 p1 = new Polymorphism3(); 
		p1.print(5);
		
		p1.print("Hello World");
		
		System.out.println ("Sum of two integers: " + p1.print(2, 3)); 
		
		System.out.println ("Sum of two doubles: " + p1.print(2.0, 3.0));

	}

}


//major key take aways
//method overloading (OR compile time polymorphism)
//1. occurs within the same class & no inheritance is required. 
//2. it can have different return type and number of parameters can be different 
//3. method names should be the same. 
//4. it can have different types of parameters 
//5. static methods can be overloaded. 
