package com.bptn.course._003_reverse_number_program;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			int reversedNumber = 0;
			while (number != 0) {
			    int lastDigit = number % 10;
			    reversedNumber = reversedNumber * 10 + lastDigit;
			    number /= 10; //or number = number / 10; 
			}

			System.out.println("Reversed number: " + reversedNumber);
		} 


	}
	

}
