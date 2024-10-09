package com.bptn.course._20_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> people = new HashMap<>(); 
		
		people.put("Angie", 33); 
		people.put("Steve", 30); 
		people.put("John", 32); 
		
		for(String key: people.keySet()) {
			System.out.println("Name: " + key + "," + " Age: " + people.get(key));
		}
	}

}
