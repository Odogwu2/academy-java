package com.bptn.course._11_access_modifiers._02_package_b;

import com.bptn.course._11_access_modifiers._01_package_a.ClassA; //import is added because ClassA is present

public class ClassB  extends ClassA{

	public static void main(String[] args) {
		
		
		ClassA myObj = new ClassA(); 
		
		//myObj.privateMethod(); //no, we cannot access a private method outside the class and in a different package. . 
		//System.out.println("Accessing private variable: " + myObj.privateVar); //no, we cannot access the private var outside the class and in a different package.
		
		//myObj.defaultMethod(); //no, we cannot access a default method outside the class and in a different package. 
		//System.out.println("Accessing default variable: " + myObj.defaultVar); //no, we cannot access the default variable outside the class and in a different package. 
		
		myObj.publicMethod(); //yes, we can access a public method outside the class and in a different package. 
		System.out.println("Accessing public variable: " + myObj.publicVar); //yes we can access the public var outside the class and in a different package. 
		
		//myObj.protectedMethod(); //NO, we cannot access a protected method outside the class and in a different package 
		//System.out.println("Accessing protected variable: " + myObj.protectedVar); //NO, we cannot access the protected var outside the class and in a different package.
		
		ClassB myObj1 = new ClassB(); //create an object of ClassB 
		
		//yes, we can access protected method through a subclass from a different package. 
		myObj1.protectedMethod();
		
		//yes, we can access protected variable through a subclass from a different package. 
		System.out.println("Accessing protected variable: " + myObj1.protectedVar);
	}

}
