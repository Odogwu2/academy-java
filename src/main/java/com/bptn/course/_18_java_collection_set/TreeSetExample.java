package com.bptn.course._18_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

//key things to note. 
//1. Understanding the insertion order - By Default, it's insertion order is a Natural ascending order (alphabetical order). 
//2. Does it allow null values  - Does NOT allow addition of null values. it throws a NullPointerException.  
//3. Does it allow duplicates - NO 
//4. Underlying implementation - uses the HashTable and Doubly LinkedList. 
//5. A TreeSet is NOT indexed. 


public class TreeSetExample {

	public static void main(String[] args) {
		
		//create an object of a TreeSet 
		
		Set<String> treeSet = new TreeSet<>(); 
		
		treeSet.add("mango"); 
		treeSet.add("lemon");
		treeSet.add("lime");
		treeSet.add("grapes");
		treeSet.add("cherry");
		treeSet.add("pineapple");
		treeSet.add("mango");
		//treeSet.add(null);
		
		System.out.println("The TreeSet is: " + treeSet);
		

	}

}
