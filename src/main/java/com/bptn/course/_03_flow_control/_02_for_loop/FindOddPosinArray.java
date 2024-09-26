package com.bptn.course._03_flow_control._02_for_loop;

public class FindOddPosinArray {

	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50}; 
		
		System.out.println ("At odd indexes, the elements are: ");
		
		//Approach 1 
		//for (int i = 1; i < numbers.length; i+=2) {
			//System.out.println(numbers[i]);
		//}
		
		//Approach 2 
		for (int i = 0; i < numbers.length; i++){
			if (i%2!=0) {
				System.out.println (numbers[i]);
			}
		}

	}

}

//i = 0, 1, 2, 3, 4, 
// odd indexes = 1, 3, 5, 7