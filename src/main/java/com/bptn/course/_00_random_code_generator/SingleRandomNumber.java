package com.bptn.course._00_random_code_generator;

import java.util.Random;

public class SingleRandomNumber {

	public static void main(String[] args) {
		//Random rand = new Random(); 
        
            int randomNumber = (int)(Math.random() * 100) + 1; 
            //return type of the method which casts the variable to the datatype 
            // Math.random generates a random number
            // datatype variableName = objectName.method();
            
            System.out.println("After execution the Random number is: " + randomNumber);
        


	}

}
