package com.bptn.course._01_big_coding_wk1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		//initialize known variables 
		//int a = 0; 
		//int b = 0; 
		//int c; 
		
		Scanner scanner = new Scanner(System.in); // Declare scanner method
		int proceed; // This variable will control whether to continue with the calculator or not after completing a full loop. 
		
		//with the do method below, telling the program to do the following
		
		do {
			System.out.println("What operation would you like to perform today?: \nPress 1 for addition \nPress 2 for subtraction \nPress 3 for multiplication \nPress 4 for division \nPress 5 to square number \nPress 6 to find a square root \nPress 7 to find the reciprocal");
		
		int num = scanner.nextInt(); // this takes the input from the user to begin running through the conditions. 
		
		//using an if else-if statement to use user input to do the right action.
		//using a double data type because of decimal values that can be entered or be the outcome of a calculation. 
		
		if (num == 1) {
			System.out.println("Enter your first number: ");
			double A = scanner.nextDouble(); 
			System.out.println("Enter your second number: ");
			double B = scanner.nextDouble(); 
			double C = A + B; 
			System.out.println("The addition of the numbers " + A + " and " + B +  " is = " + C);
			
		}
		else if (num == 2) {
			System.out.println("Enter your first number: ");
			double A = scanner.nextDouble(); 
			System.out.println("Enter your second number: ");
			double B = scanner.nextDouble(); 
			double C = A - B; 
			System.out.println("The subtraction of the numbers " + A + " and " + B +  " is = " + C);
		}
		else if (num == 3) {
			System.out.println("Enter your first number: ");
			double A = scanner.nextDouble(); 
			System.out.println("Enter your second number: ");
			double B = scanner.nextDouble(); 
			double C = A * B; 
			System.out.println("The Product of the numbers " + A + " and " + B +  " is = " + C);
		}
		else if (num == 4) {
			System.out.println("Enter your first number: ");
			double A = scanner.nextDouble(); 
			System.out.println("Enter your second number: ");
			double B = scanner.nextDouble(); 
			double C = A / B; 
			System.out.println("Dividing " + A + " by " + B + " the quotient is " + C + "\nThe remainder is " + (A%B));
			//added the remainder function to be calculated inside the print statement, not sure if there's a better way. 
		}
		else if (num == 5) {
			System.out.println("Enter a number: ");
			double A = scanner.nextDouble(); 
			//System.out.println("Enter your second number: "); 
			//commenting this out because for square root, you need just one value. 
			//double B = scanner.nextInt(); 
			double C = A * A; 
			System.out.println("The Square of the number is = " + C);
		}
		else if (num == 6 ) {
			System.out.println("Enter a number: ");
			double A = scanner.nextDouble(); 
			//System.out.println("Enter your second number: ");
			//commenting this out because for square root, you need just one value. 
			//double B = scanner.nextInt(); 
			double C = Math.sqrt(A); 
			System.out.println("The Squareroot of the number is = " + C);	
		}
		else if (num == 7) {
			System.out.println("Enter a number: ");
			double A = scanner.nextDouble(); 
			double C = 1 / A; 
			System.out.println("The Reciprocal of the number is = " + C);
		}
		else {
			System.out.println("Invalid choice! Please make a valid choice."); 
		}
		System.out.println("To continue calculation Press 1, else press any number to exit"); 
		proceed = scanner.nextInt();  
	} while (proceed == 1); //as long as the user enters 1, the do loop will be re-reinitiated. 
							//Anything other than 1 will trigger the last statement. 
		
		System.out.println("Thank you for using my Calculator. Bye!");
		scanner.close(); //closing the scanner resource. 
	

	}
		 

}


//Press 1 for addition 
//Press 2 for subtraction 
//Press 3 for multiplication 
//Press 4 for division 
//Press 5 to square number 
//Press 6 to find a square root 
//Press 7 to find the reciprocal
