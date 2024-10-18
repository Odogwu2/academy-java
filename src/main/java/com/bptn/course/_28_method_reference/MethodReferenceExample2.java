package com.bptn.course._28_method_reference;

@FunctionalInterface
interface A{
	void showInterfaceInfo(String message);
}

public class MethodReferenceExample2 {
	
	
	//create a static method 
	public static void show(String message) {
		
		System.out.println(message);
	}

	public static void main(String[] args) {
		
		
		//using the lambda expression ClassName.staticMethodName 
		A obj = (message)-> MethodReferenceExample2.show(message);
		obj.showInterfaceInfo("Hello");
		
		
		//using method reference operator ClassName::staticMethodName 
		A obj1 = MethodReferenceExample2::show; 
		obj1.showInterfaceInfo("Hola Hola");

	}

}
