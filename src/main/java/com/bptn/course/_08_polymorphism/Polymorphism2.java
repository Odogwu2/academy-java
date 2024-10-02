package com.bptn.course._08_polymorphism;

//creating parent class called Shape. 
class Shape{
	
	void drawAngle() {
		System.out.println ("Drawing a shape angle");
	}
	
}

//creating a subclass Rectangle. 

class Rectangle extends Shape{
	@Override
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
	
}

public class Polymorphism2 {

	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle(); 
		r1.drawAngle();

	}

}


//1. Create a parent class called Shape. 
//2. Create one sub class called Rectangle
//3. Create method called drawAngle() in the Shape class and override it in the rectangle class. 