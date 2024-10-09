package com.bptn.course._20_java_collections_map;

import java.util.TreeMap;

//things 2 note: 
//1. it takes the natural ascending order of the keys. 
//2. It does NOT allow NULL values in the Key. 
//3. it does allow null values in the value object. 
//4. it can take multiple null values in the value object
//2. it does NOT allow duplicates 
//3. if there are duplicate Keys, it will override the first one and update the value with the value of the duplicate. 
//4. Values can have duplicates but NOT keys. 
//5. A HashMap can have multiple null VALUES.
//6. A HashMap can have only ONE null KEY 

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> name = new TreeMap<>(); 
		
		name.put("John", 31); 
		name.put("Mary", 32);
		name.put("Max", 33);
		name.put("Lisa", 37);
		name.put("James", 50);
		name.put("Mordock", 40);
		name.put("Mordock", 44);
		
		System.out.println(name);

		
		//Access an element on the map. 
		System.out.println("Mary's age is: " + name.get("Mary"));
		
		//access the first key. 
		System.out.println("Get first key of the map: " + name.firstKey());
		
		//access the first entry
		System.out.println("Access the first entry of the map: " + name.firstEntry());
			
		
		
		
	}

}
