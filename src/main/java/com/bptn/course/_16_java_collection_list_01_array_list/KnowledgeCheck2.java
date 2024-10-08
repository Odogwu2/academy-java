package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class KnowledgeCheck2 {
    public static int sumNegValues(ArrayList<Integer> list) {
        //code here
    	
    	int negSum = 0; //initializing the sum of negative values to 0
    	
    	for (int i = 0; i < list.size(); i++) //for loop to run through the size of the ArrayList. 
    	{
    		if (list.get(i)< 0)  //if any value at the index on every iteration is less than 0, this is the condition. 
    		{
    			negSum += list.get(i);
    			//adding the negSum value at the start of each iteration, to the element at the index to get the next negative sum Value. 
    		}
   
    	}
    	return negSum; 
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}