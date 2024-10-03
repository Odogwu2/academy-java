package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {
	
	
	//declare a private variable. 
	private int privateVar; 
	
	//declare a public variable. 
	public int publicVar; 
	
	//declare a default variable. 
	int defaultVar; 
	
	//declare a protected variable 
	protected int protectedVar; 
	
	//declare a private method. 
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	
	//declare a public method
	public void publicMethod() {
		System.out.println("This is a public method");
	}
	
	//declare a default method
	void defaultMethod() {
		System.out.println("This is a default method");
	}
	
	//declare a protected method 
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}

	public static void main(String[] args) {
		
		//create an object of classA 
		ClassA myObj = new ClassA(); 
		myObj.privateMethod(); //we can access a private method within the same class. 
		System.out.println("Accessing private variable: " + myObj.privateVar); //yes, we can access the private var within the same class. 
		
		myObj.defaultMethod(); //yes, we can access a default method within the same class. 
		System.out.println("Accessing default variable: " + myObj.defaultVar); //yes we can access the default variable within the same class
		
		myObj.protectedMethod(); //yes, we can access a protected method within the same class. 
		System.out.println("Accessing protected variable: " + myObj.protectedVar); //yes we can access the protected var within the same class. 
		
		myObj.publicMethod(); //yes, we can access a public method within the same class. 
		System.out.println("Accessing public variable: " + myObj.publicVar); //yes we can access the public var within the same class. 

	}

}


//Major key takeaways. 
//1. We can access the private variable and method within the same class. 
