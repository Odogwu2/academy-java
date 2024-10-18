package com.bptn.course._28_method_reference;

@FunctionalInterface 
interface Sayable{
	void say(); 
}

class MyClass{
	
	static void saySomething() {
		System.out.println("I say something");
	}
}
public class MethodReferenceExample {

	public static void main(String[] args) {
		
		
		Sayable obj = MyClass::saySomething; 
		
		obj.say(); 

	}

}
