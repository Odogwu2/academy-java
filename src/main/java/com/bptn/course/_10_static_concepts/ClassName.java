package com.bptn.course._10_static_concepts;

public class ClassName {
	
	
	//declare a static variable. 
	static int staticVariable = 100; 
	
	
	//declare an instance variable
	int instanceVariable; 
	
	//declare a static method 
	static void staticMethod() {
		System.out.println("Static method is called.."); 
		
		//can i access an instance variable within a static method?
		//instanceVariable = 100; this won't work
		
		//can i access an instance method within a static method?
		//this.instanceMethod(); (this won't work too) 
		
	}

	//declare instance method
	void instanceMethod() {
		System.out.println("Instance method is called..");
		
		//can i access a static variable within an instance method? - Yes. 
		System.out.println("Static variable: " + staticVariable);
		
		//can I access a static method within an instance method?
		staticMethod(); 
	}
	
	public static void main(String[] args) {
		
		ClassName c1 = new ClassName(); 
		c1.instanceMethod();
		
		//Access the static variable. 
		System.out.println ("Static variable: " + staticVariable); 
		
		staticMethod(); 
		

	}

}

//Major take aways. 
//1. We cannot access instance variables or methods within a static method. 
//2. we can access static variables and static methods within an instance method. 
//3. we can access a static variable and static method within the main method. 
//4. static methods can be overloaded but cannot be overriden 
