package com.bptn.course._19_hash_map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		Set<String> set = new HashSet<>(); 
		
		set.add("A"); 
		set.add("B"); 
		set.add("C"); 
		
		// Print the size of the set
		System.out.println("Set size: " + set.size());

		// Using a for-each loop to print the values in the set
//		for (String s : set) {
//			System.out.println("Value: " + s); 
//		}
		
		//using a for loop
		Iterator<String> it = set.iterator(); 
		while (it.hasNext()) {
//			String x = it.next(); 
			System.out.println("Value: " + it.next());
		}

		// Use add() method to add a new value to the set
		set.add("D"); 
		
		System.out.println("Set after using add():");
		
//		Iterator<String> it1 = set.iterator(); 
		it = set.iterator(); //reinitialising the iterator. 
		while (it.hasNext()) {
			System.out.println("Value: " + it.next());
		}

		// Use remove() method to remove a value from the set
		set.remove("A"); 
		
		System.out.println("Set after using remove():");
		
//		System.out.println(set);
//		Iterator<String> it2 = set.iterator();
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println("Value: " + it.next());
		}

		// Use contains() method to check if the value "C" exists in the set
		String toCheck = "C";
		if (set.contains(toCheck)) {
			System.out.println("Value " +"'"+ toCheck + "' " + "exists in the set.");
		}else {
			System.out.println("Value" +"'"+ toCheck + "' " + "does not exist in the set.");
		}
	}

}
