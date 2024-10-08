package com.bptn.course._18_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

//key things to note. 
//1. Understanding the insertion order - it preserves insertion order. 
//2. Does it allow null values  - it allows maximum of one null value.  
//3. Does it allow duplicates - NO 
//4. Underlying implementation - uses the HashTable and Doubly LinkedList. 
//5. A LinkedHashSet is NOT indexed. 


public class LinkedHashExample {

	public static void main(String[] args) {
		//Create a LinkedHashSet object 
		
		Set<String> linkedHashSet = new LinkedHashSet<>(); 
		
		linkedHashSet.add("Cucumber");
		linkedHashSet.add("Cucumber");
		linkedHashSet.add("Grapes");
		linkedHashSet.add("Guava");
		linkedHashSet.add("Lime");
		linkedHashSet.add("Lemon");
		linkedHashSet.add(null);
		
		System.out.println("The LinkedHashSet is: " + linkedHashSet);
		

	}

}
