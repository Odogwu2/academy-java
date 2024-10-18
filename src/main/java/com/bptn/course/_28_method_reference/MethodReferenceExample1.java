package com.bptn.course._28_method_reference;

@FunctionalInterface
interface JavaInterface{
	
	//SAM
	int findMax(int a, int b);
}


public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		
		//using lambda expression to implement the abstract method. 
		JavaInterface obj = (a,b)-> Math.max(a, b); 
		
		System.out.println("Result " + obj.findMax(2, 3));
		
		
		
		//using a static method reference, this is how we call it | ClassName::staticMethodName 
		JavaInterface obj1 = Math::max; //this is a method reference
		
		System.out.println("Result " + obj1.findMax(4, 5));

	}

}
