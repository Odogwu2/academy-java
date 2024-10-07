package com.bptn.course._16_java_collection_list_01_array_list._coding_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//less traditional method for converting ArrayList to an array.
//easy and straightforward. Pay attention. 

public class Main1 {
	public static void main(String[] args) {
        
	       List<String> nameList = new ArrayList<String>();

	       nameList.add("Robert");
	       nameList.add("Samson");
	       nameList.add("Alex");
	       nameList.add("William");
	       
	       System.out.println("Elements of List: " + nameList);
	       
	       //Declare an array whose length is the same as the size of the ArrayList. 
	       //in this case, 3. 
	       
	       String[] output = new String[nameList.size()]; 
	       //syntax for creating an array. 
	       
	       
	       output = nameList.toArray(output);
	       //what method did we use after the dot. 
	       
	       //printing the elements of the array in a single line. 
	       System.out.println("Elements of array: " + Arrays.toString(output)); 

	}
}
