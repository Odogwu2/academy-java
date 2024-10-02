package com.bptn.course._09_abstraction;

//abstraction using interface (after java 8) 
//from Java 8 interfaces can support abstract methods, default methods and static methods. 

interface Operations {
	
	void draw(); //abstract method, it has no implementation 
	
	
	//default method: it has some implementation 
	default int add (int a, int b) {
		return a+b; 
	}
	
	//static method. 
	static double getRandomNumber() {
		return Math.random();
	}
}

//sub class. create a sub class that implements the Operations interface. 
class Calculator implements Operations{
	//compiler always enforces the sub class to implement or override the methods in the abstract methods. 
	@Override
	public void draw() {
	System.out.println("Draw method implemented by Calculator class");
		
	}
	
}
public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); 
		c1.draw(); 
		
		int result = c1.add(2,3);
		System.out.println("The result is: " + result);
		
		System.out.println("The random number is: " + Operations.getRandomNumber()); 
		

	}

}

//major take aways 
//1. interface cannot be instantiated 
//2. Abstract methods in the interface is implemented using a sub class. 
//3. interfaces support multiple inheritance - which means a sub class can implement multiple interfaces. 
//4. interfaces cannot have instance variables. 
//5. interfaces cannot have constructors. 
//6. it can consist of constants. 