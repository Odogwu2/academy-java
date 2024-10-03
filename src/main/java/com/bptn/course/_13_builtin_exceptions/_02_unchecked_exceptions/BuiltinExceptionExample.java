package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class BuiltinExceptionExample {
	
	//create a method which checks if the number is +ve or -ve
	//throws always comes in the method signature which warns that this method has the ability to encounter a situation 
	//and should be in a position to handle it. 
	
	public static void checkPositive (int number) throws IllegalArgumentException {
		if(number < 0) {
			throw new IllegalArgumentException("The number has to be positive");
		}
		System.out.println("The number is positive");
	}

	public static void main(String[] args) {
		
		try {
			checkPositive(10); //this call is expected to be OK 
			checkPositive(-10); //this is a critical statement. 
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught an exception: " + e.getMessage());
			
		}

	}

}
//throw always creates an instance of exception or its subclasses. . 
//throw always comes with new. 
//throws is followed by the exception name. 
//illegal argument is a subclass of RuntimeException 
//RuntimeException is a sub class of Exception

//throws is optional in case of unchecked exceptions 
//throws is used in case of checked exception (custom exceptions which are created as a checked exception)
//throw is used explicitly within a block of code or a method. 