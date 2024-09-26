package com.bptn.course._03_flow_control._02_for_loop;

public class FibonacciSequence {

	public static void main(String[] args) {
		// needs 0 and 1 to start the sequence
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89....

		// predefined numbers to begin the fibonacci sequence.

		int num1 = 0;
		int num2 = 1;
		int num3;

		System.out.println(num1);
		System.out.println(num2);

		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2; // 0+1 = 1

			num1 = num2; 
			/* reassigning the first value with the second because on each iteration,
			its the 2nd to the last number that becomes the first Number.
			*/
			num2 = num3;
			/* reassigning the second value with the third because on each iteration, 
			the 'third" on each iteration becomes the 2nd number needed.
			*/

			System.out.println(num3); //this is inside the loop, so it keeps printing till i exceeds 8

		}

//i = 0 (1st iteration) 
		// num1 = 0 num2 = 1
		// num3 = 1

		// num1= num2; 1
		// num2 = num3; 1

		// i = 1 (2nd iteration)
		// num3 = num1+num2; // i+1 = 2

		// num1 = num2; //1
		// num2 = num3; //2

		// i = 2 (3rd iteration)
		// num3 = num1+num2; //1+2 = 3

		// num1 = num2 //2
		// num2 = num3 //3
	}

}
