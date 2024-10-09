package com.bptn.course._20_java_collections_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//things 2 note: 
//1. it does preserve insertion order 
//2. it does NOT allow duplicates 
//3. if there are duplicate Keys, it will override the first one and update the value with the value of the duplicate. 
//4. Values can have duplicates but NOT keys. 
//5. A LinkedHashMap can have multiple null VALUES.
//6. A LinkedHashMap can have only ONE null KEY 

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> name = new LinkedHashMap<>(); 
		
		name.put("John", 31); 
		name.put("Mary", 32);
		name.put("Max", 33);
		name.put("Lisa", 37);
		name.put("James", 50);
		name.put("Mordock", 40);
		name.put("Mordock", 44);
		
		System.out.println(name);
		
		//accessing the value in a LinkedHashMap. 
		System.out.println("John's age is: " + name.get("John"));
		
		//looping over a LinkedHashMap using entry set method. 
		for (Map.Entry<String, Integer> entry : name.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Accessing the map using iterator 
		Iterator<Map.Entry<String, Integer>> it = name.entrySet().iterator(); 
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next(); 
			System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
		}

	}

}
