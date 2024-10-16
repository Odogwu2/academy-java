package com.bptn.course._25_sorting;

import java.util.Arrays;

public class InsertionSort {
	
	
	
	public static void insertionSort(int[] elements) {
		
		
		for (int i = 1; i < elements.length; i++) {
			
			/*
			 * possibleIndex>0: we have to ensure that the new index is > 0. 
			 * 
			 * temp < elements[possibleIndex - 1]: we check if the current element is smaller 
			 * than the previous element. 
			 * 
			 * We store the current element (in the iteration)
			 * in the temporary variable temp, so we can insert it 
			 * when we find the right insertion point. 
			 * 
			 * we also want to store the value of the current index as well. 
			 */
			
			int temp = elements[i];
			int possibleIndex = i; 
			
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				
				/* 
				 * we move the element one position to the right 
				 * if it is smaller than the current element. 
				 * 
				 */
				
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex-- ; 
				
			}
			
			/*
			 * Once we found the insertion point, we insert the current element. 
			 */
			
			elements[possibleIndex] = temp; 
		}
		
	}

	public static void main(String[] args) {
		// creating an array here 
		
		int[] arr1 = {3, 15, 8, 2, 19, 55}; 
		System.out.println("Before: " + Arrays.toString(arr1));
		
		
		insertionSort(arr1);
		System.out.println("After: " + Arrays.toString(arr1));

	}

}
