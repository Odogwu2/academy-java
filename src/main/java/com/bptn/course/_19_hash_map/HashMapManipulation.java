package com.bptn.course._19_hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {

	public static void main(String[] args) {
		
		
		// Create a HashMap and populate it with initial key-value pairs
		Map<String, Integer> map = new HashMap<>(); 
		
		map.put("A", 1); 
		map.put("B", 2); 
		map.put("C", 3); 
		

		// Print the size of the map
		System.out.println("Map size: " + map.size());
		

		// Use a for loop to print the key-value pairs in the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

		// Use get() method to get the value of key "A"
		
		Integer value = map.get("A"); 
		System.out.println("Value of key 'A': " + value); 
		
		

        // use put() method to add a new key-value pair to the map
		map.put("D", 4); 
		
		System.out.println("Map after adding a new key-value pair:");
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int values = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + values);
		}
		

		// Use the containsKey() method to check if the key "C" exists in the map
		String toCheck = "C";
		if (map.containsKey(toCheck)) {
			System.out.println("Key " +"'"+ toCheck + "' " + "exists in the map");
		}else {
			System.out.println("Key" +"'"+ toCheck + "' " + "does not exist in the map");
		}


	}

}


