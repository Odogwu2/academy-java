package com.bptn.course._003_reverse_number_program;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // initializing the scanner object. System.in is responsible for user input. 

        System.out.print("Enter a number: "); // call to action for the user to enter a number. 
        int number = scanner.nextInt(); //reads the integer entry and stores the input in "number" which is of the integer data type. 

        int reversedNumber = 0; // declare a variable and initialize with a 0 value. the initial value will be used later to calculate a number.  
        while (number != 0) // as long as the number is not zero, the loop below is going to run and only stop when all the digits in number have been processed.
        //Checks the condition before executing the code. 
        {
            int lastDigit = number % 10; // to get the last digit of any number, we will be getting the remainder when the number is divided by 10. 
            reversedNumber = reversedNumber * 10 + lastDigit;  //Add that digit to reversedNumber, shifting its existing digits to the left by multiplying by 10.
            number /= 10; //or number = number / 10; This ensures that the next iteration of the loop works on the remaining digits
        }

//        	for (number !=0; reversedNumber = reversedNumber * 10 + lastDigit; number/=10) {
//        		intlastDigit = number % 10;
//        	}
        System.out.println("Reversed number: " + reversedNumber); 
        scanner.close();

	}
	

}
