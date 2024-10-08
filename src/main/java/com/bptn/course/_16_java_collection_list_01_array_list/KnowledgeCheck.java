package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;



public class KnowledgeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
       
        //foreach loop
        //for (datatype item : collection)
        for (int i : nums) {
            
        	values.add(i);
            //syntax to add values to an ArrayList. 
            //using the add method. 
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}