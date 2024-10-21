package com.bptn.course._22_big_coding._insertion_sort;

//in an insertion sort, it assumes the first index is already sorted. 
//we loop through the array starting at index 1 and not index 0, hence int i = 1
//traverse the array with array.length
//We store the current element (in the iteration) in the temporary variable current, so we can insert it when we find the right insertion point. Hence "int current"
//initialize a second variable 'j' which is what will then be compared with current variable. 
//j in this case will be the element before the current element (i-1)
//compare  curent element with elements to the left (which is the sorted portion)
//we then shift elements that are greater than current to the right. 

public class InsertionSort {

	// This method sorts an array in ascending order using insertion sort algorithm

	public static void insertionSort(int[] arr) {

		// Check if the array is null or has less than 1 element
		if (arr == null || arr.length < 1) {
			// Return if the array is null or has less than 1 element
			return;
		}
		// Loop through the array starting from index 1 to length of the array

		/*
		 * (as the first element is already "sorted")
		 */
		for (int i = 1; i < arr.length; i++) {
			// Store the current element

			/*
			 * We store the current element (in the iteration) in the temporary variable
			 * current, so we can insert it when we find the right insertion point.
			 */
			int current = arr[i];

			// Initialize j with i - 1
			// initializing it with the index just before the current element.
			int j = i - 1;

			// Inner loop to compare current element with elements before it in the array
			while (j >= 0 && current < arr[j]) {

				// Shift the element to the right (at index 'j' to 'j+1')
				/*
				 * we move the element one position to the right if it is smaller than the
				 * current element.
				 */
				arr[j + 1] = arr[j];

				// Decrement j to compare with next element
				j--;

			}
			// Insert the current element at its correct position

			/*
			 * Once we found the insertion point, we insert the current element.
			 * 
			 */
			arr[j + 1] = current;

		}
	}

	// Do not modify below code
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 3, 4, 1, -2, 4, 8 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}