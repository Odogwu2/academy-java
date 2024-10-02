package com.bptn.course._07_oop;

public class Car {

	// Declare a String color, String brand, int price
	private String color; // creating the instance variables.
	private String brand;
	private int price;

	public Car() {
		// this is a default constructor, these are the values that will be used to
		// create a default car object.
		// the this keyword is used to refer to the current instance.
		this("black", "Volvo", 23000);
		// this.color = "black";
		// this.brand = "Volvo";
		// this.price = 23000;
	}

	// Define a parameterized constructor with parameters String color, String
	// brand, int price
	public Car(String color, String brand, int price) {
		// Assign Constructor parameters String color, String brand, and int price to
		// Class variables with the this keyword.
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	void printCarDetails()// Method to print the car details
	{
		this.print(); // indicating calling print() from the current instance of the class
	}

	private void print() {
		System.out.println("Car{color='" + this.color + "', brand='" + this.brand + "', price=" + this.price + "}");
	}

	public static void main(String[] args) {
		Car defaultCar = new Car(); // creating a new object from the Car class.
		defaultCar.printCarDetails();

		// Car defaultCar2 = new Car("red", "mercedes", 60000);
		// defaultCar2.printCarDetails();

	}

}
