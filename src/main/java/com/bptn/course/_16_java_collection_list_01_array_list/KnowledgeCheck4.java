package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class KnowledgeCheck4 {
	public static void shiftLeftOne(ArrayList<Integer> list) {
        //code here
//		for (int i = 0; i < list.size(); i++) {
//			list.set(i, )
//		}
		
		if (list.size() >0) 
		{
			int firstElement = list.get(0); //store the first element in this variable. ;
			
			for (int i = 1; i<list.size(); i++) //starting the index from 1
			{
				list.set(i-1, list.get(i)); 
			}
			list.set(list.size()-1, firstElement); //the first element that in the last position. 
		}
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}