package com.bptn.course._07_oop;

public class Phone {
	
	//public, private, default, protected
	//declare instance variables 
	//define properties/attributes 
	//weight, height, width, color 
	
	private int weight; 
	private int height; 
	private int width; 
	private String color; 
	
	//constructor 
	//has same name as the ClassName 
	//does not have a return type 
	//default constructor - does not have any parameters passed
	public Phone() {
		//default values 
		weight = 150; 
		height = 140; 
		width = 70; 
		color = "black";
	}
	
	//parameterized constructor 
	public Phone (int w, int h, int w1, String c) {
		weight = w; 
		height = h; 
		width = w1; 
		color = c; 
	}
	
	//another parameterized constructor. 
	public Phone (int w, int h, int w1) {
		weight = w; 
		height = h; 
		width = w1;  
	}
	
	//declare its instance methods. It's functionalities or behaviors. 
	public void makePhoneCall () {
		System.out.println ("Make a phone call."); 
	}
	
	public void sendTextMessage () {
		System.out.println ("Send a text message.");
	}
	

	public static void main(String[] args) {
		
		//create an object of the phone class using default constructor 
		Phone myObj1 = new Phone (); 
		System.out.println("Default phone: " + "weight: " + myObj1.weight +  " height: " + myObj1.height + " width: " + myObj1.width + " color: " + myObj1.color);
		
		
		Phone myObj2 = new Phone (100, 20, 10, "Black");
		System.out.println("Custom phone: " + "weight: " + myObj2.weight +  " height: " + myObj2.height + " width: " + myObj2.width + " color: " + myObj2.color);
		
		
		Phone myObj3 = new Phone (250, 150, 60);
		System.out.println("Custom phone: " + "weight: " + myObj3.weight +  " height: " + myObj3.height + " width: " + myObj3.width);

	}

}
//Instance variables are always declared as private, because we want to encapsulate these from being accessed from other class. 
//Instance methods are always declared as public. because we want it to be accessible. 
//Private varibles are declared right after the main class. (in this case, line 3) 