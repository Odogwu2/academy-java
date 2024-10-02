package com.bptn.course._08_polymorphism;


//parent class
class Animal { 
	
	void makeSound() {
		System.out.println("Animal makes a sound");
	}

	
}

//sub class 
class Dog extends Animal {
	//has its own methods.
	
	//have the same return type and have the same method name
	@Override 
	void makeSound() {
		System.out.println("Dog barks"); 
	}
	
}
public class Polymorphism1 {

	public static void main(String[] args) {
		//create an object of Animal class 
		Animal a1 = new Animal(); 
		a1.makeSound();
		
		//create an object from the dog class 
		Dog d1 = new Dog(); 
		d1.makeSound();
	}

}


//major key take aways 
//method overriding (run time polymorphism) 
//conditions for override to happen 
//1. Scenario: when a sub class decides to override an existing method in the parent class (e.g., makeSound was existing) 
//2. Method overriding requires inheritance to happen (class Dog extends Animal). extends is the keyword for inheritance. 
//3. name of the method, return type of the method & number of parameters in the overriden method should be the same as that of the parent class.
//4. by convention, overriden methods has an override annotation above it's method signature. 
//5. Static methpds in the parent class cannot be overriden 
