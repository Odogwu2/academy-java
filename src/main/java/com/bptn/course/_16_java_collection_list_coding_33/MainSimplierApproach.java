package com.bptn.course._16_java_collection_list_coding_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//easier approach for previous task without using for loop  or methods. 
public class MainSimplierApproach {
	
//	// Complete the functionality of the method below
//    public static  List<String> convertArrayToList(String[] inputArray) {
//        
//        // Create a new ArrayList of String. 
//    	List<String> newList = new ArrayList<>();
//
//        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
//    	for(String s : inputArray) {
//    		newList.add(s); 
//    	}
//    	
//    	
//        // return the new list with elements.
//    	return newList; 
//    }
// 
//   
//    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};
        
        List<String> newList = new ArrayList<>(Arrays.asList(cars)); 
        
        System.out.println("The converted arrayList is: " + newList);

//        List<String> arraylist = convertArrayToList(cars);
//
//        System.out.println(arraylist);
    }


}


