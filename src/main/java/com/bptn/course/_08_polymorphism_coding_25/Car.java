package com.bptn.course._08_polymorphism_coding_25;

public class Car extends Vehicle{

	  //Step 2a: Declare String steeringWheel 
	private String steeringWheel; 

    //Step 2b: Define a parameterized constructor as per the specifications above
	public Car(String color, String brand, String steeringWheel) {
		super (color, brand); //this calls the constructor from the Vehicle clss . when you want to call any instance variable or constructor or method from the parent class. 
		this.steeringWheel = steeringWheel; 
	}

	   //Step 2c: Create a print() method as per the specifications above
		public void print() {
			super.print(); // this calls the print() method from the Vehicle parent class. 
		}
		
//		@Override 
//		public void print() {
//			System.out.println ("I am a car");
//		}
	

	

}
