package com.bptn.course._22_big_coding._two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// Method that returns the indices of two elements in the nums array that add up
	// to the target value
	public int[] twoSum(int[] nums, int target) {
		// Initialize a HashMap to store the value of each element in the nums array and its index
		 Map<Integer, Integer> map = new HashMap<>();

		// Loop through each element in the nums array
		for (int i = 0; i < nums.length; i++) {
			// Calculate the complement, which is the difference between the target and the current element
			int complement =  target - nums[i];

			// Check if the complement is found in the HashMap
			if (map.containsKey(complement)) {
				/* If the complement is found, return the index of the complement and the current index because these two indices correspond to two elements that add up to the target*/
				return new int[] {map.get(complement), i};
				
			}
			// If the complement is not found, put the current element and its index into the HashMap
			map.put(nums[i], i); 
		}

		// If no two sum solution is found, throw an IllegalArgumentException
		throw new IllegalArgumentException("No two sum solution");
	}
    // Do not modify the code below:
	// Main method to test the twoSum method
	public static void main(String[] args) {
		// Example array of integers
		int[] nums = { 2, 7, 11, 15 };

		// Example target value
		int target = 9;

		// Create a TwoSum object
		TwoSum solution = new TwoSum();

		// Call the twoSum method to get the indices of the two elements that add up to
		// the target value
		int[] indices = solution.twoSum(nums, target);

		// Print the result
		System.out.println("The indices are: " + indices[0] + " and " + indices[1]);
	}
	
	
}

/*
 * we know the complement to be the number that is required to be added to an element in the array to get the target 
 * due to this, we assign the variable int complement to be target - nums[i] as it transverses the array. 
 * 
 * if the map contains that complement variable, we retrieve the index that when added to the current number equals the target
 * map.get(complement) will give the current index of the complement number found earlier. 
 * i is the current index in the loop, representing the other numbers that together with the complement (not the index) adds up to the target
 * 
 */

//for (int i = 0; i < nums.length; i++) {
//	for (int j = 1, j < nums.length; j++) {
//		if (nums[i] + nums[j]) {
//			return new int[] {i,j}; 
//			
//		}
//	}
//} return nums; 
//}

