package com.bptn.course._00_random_code_generator;

import java.util.Random;

public class RandomCodeGenerator {

	public static void main(String[] args) {
		Random rand = new Random(); 
		//similar utility used to Scanner. 
		//Utility objectName = new Utility
		// initialize the varible using the Random method. 
		
		
        int min = 0; //declaring the minimum random number that can be generated.
        int max = 100; //declaring the maximum random number that can be generated. 

        for (int i = 0; i < 100; i++) // (initial condition; terminal condition; increment/decrement) 
        {
        
            int randomNumber = rand.nextInt(max - min + 1) + min; 
            //return type of the method which determines what type of variable to use.
            // datatype variableName = objectName.method();
            
            System.out.println("After execution the Random number is: " + randomNumber);
        }
      // (100 - 1+1)+1
	}

}
