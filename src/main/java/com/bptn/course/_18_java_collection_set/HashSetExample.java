package com.bptn.course._18_java_collection_set;

import java.util.Set; 
import java.util.HashSet; 

//key things to note. 
//1. Understanding the insertion order - it doesn't preserve insertion order. 
//2. Does it allow null values  - it allows maximum of one null value.  
//3. Does it allow duplicates - NO 
//4. Underlying implementation - stores the order in the form of a Hash Table. 
//5. A HashSet is NOT indexed. 




public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>(); 
		
		hashSet.add("mango"); 
		hashSet.add("mango"); 
		hashSet.add("avocado"); 
		hashSet.add("apple"); 
		hashSet.add("orange"); 
		hashSet.add(null); 
		
		System.out.println("The HashSet of fruits: " + hashSet);
	}

}
