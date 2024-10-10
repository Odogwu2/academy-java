package com.bptn.course._21_java_threads;



class A{
	
	public void show() {
		for (int i = 0; i<100; i++) {
			System.out.println("Hi Java");
		}
	}
	
}


class B{
	public void show() {
		for (int i = 0; i<100; i++) {
			System.out.println("Hello Java");
		}
	}
	
	
	
	
}
public class MyThread {

	public static void main(String[] args) {
		
		//create an object of class A
		A myObj = new A(); 
		myObj.show(); 
		
		B myObj1 = new B(); 
		myObj1.show(); 

	}

}
