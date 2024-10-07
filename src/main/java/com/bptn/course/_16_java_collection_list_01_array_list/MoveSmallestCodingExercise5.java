package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.List;
import java.util.ArrayList;

public class MoveSmallestCodingExercise5 {
    public static void moveSmallest(ArrayList<Integer> list) {
        int smallestIndex = 0;
        
        //loop through all the elements in the list. 
        for (int i = 0; i <list.size(); i++) {
           
        	//we want to compare index i with the smallest element in each index. 
        	//if it is greater, we will then assign the smallest index to i 
        	if (list.get(i) < list.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        
        Integer smallest = list.remove(smallestIndex); 
        
        //move smallest to front
//        list.set(0, list.get(smallestIndex)); 
        list.add(0, smallest);
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result: " + values);
    }
}

//String longest = "";
//
//for (String word : list) {
//	if(word.length() > longest.length()) {
//		longest = word; 
//	}
//	
//}
//return longest; 
//
//}   