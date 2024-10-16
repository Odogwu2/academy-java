package com.bptn.course._25_sorting;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort {

	private static int partition(int[] numbers, int start, int end) {
		
		//pick the rightmost element as a pivot from the array
		int pivot = numbers[end]; //element at the end of the array. 
		
		
		
		//elements less than the pivot will go to the left of the 'pIndex'
		//elements greater than the pivot will go to the right of the 'pIndex'
		//equal elements can go either way. 
		
		int pIndex = start; 
		
		for (int i = start; i < end; i++) {
			
			if (numbers[i] <= pivot) {
				swap(numbers, i, pIndex);
				pIndex++; 
			}
		}
		
		//swap the 'pIndex' with pivot. 
		swap(numbers, pIndex, end); 
		
		
		//return pIndex (which is the index of the pivot element)
		return pIndex; 
		
	}


	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i]; 
		numbers[i] = numbers[j]; 
		numbers[j] = temp; 
		
	}

	// iterative Quicksort routine.
	
	private static void iterativeQuicksort(int[] numbers) {

		Stack<Pair> stack = new Stack<>();

		// get the starting and ending index of the given array

		int start = 0;
		int end = numbers.length - 1;

		// push the start & end index of the array into the stack.
		stack.push(new Pair(start, end));

		// loop until the stack is empty.
		while (!stack.empty()) {

			// remove top pair from the stack & get subarray
			// starting and ending index.

			start = stack.peek().getX();
			end = stack.peek().getY();

			stack.pop();

			// rearrange the elements across my pivot
			int pivot = partition(numbers, start, end);

			/*
			 * push subarray indices containing elements that are less than the current
			 * pivot of the stack
			 */

			if (pivot - 1 > start) {
				stack.push(new Pair(start, pivot - 1));
			}

			/*
			 * push subarray indices containing the elements that are more than the current
			 * pivot to stack
			 */

			if (pivot + 1 < end) {
				stack.push(new Pair(start, pivot + 1));
			}
		}

	}

	public static void main(String[] args) {

		int[] numbers = { 9, -3, 5, 2, 6, 8, -6, -1 };

		System.out.println("Before: " + Arrays.toString(numbers));

		iterativeQuicksort(numbers);

		System.out.println("After: " + Arrays.toString(numbers));

	}

}

class Pair {
	private final int x;
	private final int y;

	Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
