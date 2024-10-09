package com.bptn.course._20_java_collections_map;

import java.util.HashMap;
import java.util.Map;

//things 2 note: 
//1. it does NOT preserve insertion order 
//2. it does NOT allow duplicates 
//3. if there are duplicate Keys, it will override the first one and update the value with the value of the duplicate. 
//4. Values can have duplicates but NOT keys. 
//5. A HashMap can have multiple null VALUES.
//6. A HashMap can have only ONE null KEY 

public class HashMapExample {

	public static void main(String[] args) {
	
		
		Map<String, Integer> udo = new HashMap<>(); 
		
		//udo is just an object name, we can use anything. 
		//Map<K, V>
		
		udo.put("Vuitton", 32); 
		udo.put("Louie", 31); 
		udo.put("Armando", 101); 
		udo.put("Ferragamo", 52); 
		udo.put("Ferrari", 92); 
		udo.put("Vuitton", 33); 
		udo.put("Goat", 30); 
		udo.put(null, 32); 
		udo.put("Madara", null); 
		udo.put("Uzamaki", null); 
		
		System.out.println(udo);
		
		//keySet()- this returns the set view of the keys
		for(String key : udo.keySet()) {
			System.out.println("Name: " + key + " Age: " + udo.get(key)); //the get.key() returns the value of the key. 
		}
		
		//retrieve the age of an entry and print it to the console. 
		
		System.out.println("Age of Louie is: " + udo.get("Louie"));
		
		//update the value of an existing key. 
		udo.replace("Goat", 36); 
		
		System.out.println("The new age of GOAT is: " + udo.get("Goat"));
		
		//check if the key is present in the map using the containKey(obj k) method. 
		if(udo.containsKey("Louie")) {
			System.out.println("The key is existing in the map");
		}else {
			System.out.println("The key is not existing in the map");
		}
		
		//check if a value is present in the map using the containsValue
		if(udo.containsValue(32)) {
			System.out.println("The value is existing in the map");
		}else {
			System.out.println("The value is not existing in the map");
		}
		
		//putIfAbsent(object K, object V) is used to add a key value pair if a key doesnt exist in the map 
		
		udo.putIfAbsent("Kakashi", 72);
		System.out.println(udo);
		
		//iterating thru a HashMap using entrySet() method 
		for(Map.Entry<String, Integer>entry : udo.entrySet()) {
			System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
		}
		
	}

}
