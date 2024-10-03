package com.bptn.course._11_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		
		//create an object of ClassA 
		ClassA myObj = new ClassA(); 
		
		//no we cannot access the private method outside the class
		//myObj.privateMethod(); 
		//System.out.println("Accessing private variable: " + myObj.privateVar); //no, we cannot access the private var outside the class even if they are in the same package.
		
		myObj.defaultMethod(); //yes, we can access a default method outside the class but in the same package
		System.out.println("Accessing default variable: " + myObj.defaultVar); //yes we can access the default variable outside the  class but in the same package. 
		
		myObj.publicMethod(); //yes, we can access a public method outside the class but in the same package. 
		System.out.println("Accessing public variable: " + myObj.publicVar); //yes we can access the public var outside the class but in the same package. 
		
		myObj.protectedMethod(); //yes, we can access a protected method outside the class but within the same package.  
		System.out.println("Accessing protected variable: " + myObj.protectedVar); //yes we can access the protected var outside the class but in the same package. .


	}

}
