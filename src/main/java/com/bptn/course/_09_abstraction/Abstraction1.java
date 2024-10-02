package com.bptn.course._09_abstraction;

//abstraction using abstract class 

//abstract class is a class that cannot be instantiated, meaning it cannot be used to create objects. 

abstract class Shape{
	
//an abstract can consist of abstract and non-abstract methods. 
//1. Abstract method: a method which has no implementation. 
	abstract void draw(); 
	
	abstract void print(); 
	
	//normal methods: a method which has an implementation. 
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}
}

//Sub class (child class) extends Shape class 

class Circle extends Shape {

//must have the methods in the abstract class  present in the subclass that extended it. 
	@Override
	void draw() {
		System.out.println ("Draw a circle");
		
	}

	@Override
	void print() {
		System.out.println ("Print a circle");
		
	}
	
}

//creating another subclass. 
class Rectangle extends Shape {

	//must have the methods in the abstract class  present in the subclass that extended it. 
		@Override
		void draw() {
			System.out.println ("Draw a rectangle");
			
		}

		@Override
		void print() {
			System.out.println ("Print a rectangle");
			
		}
		
	}
public class Abstraction1 {

	public static void main(String[] args) {
		// Shape s1 = new Shape(); - this wont work because we can't instantiate objects from the abstract class. 
		Circle c1 = new Circle(); //you have to create objects from the sub class. in this case, the circle class
		c1.draw();
		c1.print(); 
		
		c1.moveTo(2, 3); //this is an inherited method from Shape class. 
		
		Rectangle r1 = new Rectangle(); 
		r1.draw();
		r1.print(); 
		r1.moveTo(5, 6); //inherited method from Shape class. 
	

	}

}

//Major take aways
//1. consists of abstract methods and normal methods. 
//2. the sub class is responsible for implementing the abstract method from the abstract class. 
//3. when a sub class implements the abstract methods from the abstract class, it should follow the rules of overriding. 
