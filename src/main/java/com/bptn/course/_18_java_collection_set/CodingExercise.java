package com.bptn.course._18_java_collection_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CodingExercise {

	public static void main(String[] args) {
		//Create a LinkedHashSet and populate with elements A, B, and C 
		
		Set<String> set = new LinkedHashSet<>(); 
		
		set.add("A"); 
		set.add("B");
		set.add("C");
		
		//Print the size of the set. 
		System.out.println("Set size: " + set.size());
		
		System.out.println("Elements in the set (using for-each loop):");
		
		//use a for each loop to print the elements in a set 
		for(String s : set) {
			System.out.println("Element: " + s);
		
		}
		
		System.out.println("Elements in the set (using iterator):");
		
		//Use the Iterator to print the elements in the set. 
		
		Iterator<String> it = set.iterator(); 
		
		while(it.hasNext()) {
			System.out.println("Element: " + it.next());
			
		}
		
		//Use a remove method to remove element A from the set. & print out the elements remaining in the set. 
		set.remove("A"); 
		
		System.out.println("Set after using remove(): " + set);
		
		//Use contains() method to check if the element B exists in the set 
		if (set.contains("B")) {
			System.out.println("Element 'B' exists in the set.");
		}else {
			System.out.println("Element 'B' does not exist in this set.");
		}
		
		//use clear() method to remove all elements from the set. 
		set.clear();
		
		//print out to show the set is empty. 
		System.out.println("Set after using clear(): " + set);
		
		
		
	}

}
