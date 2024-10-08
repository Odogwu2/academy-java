package com.bptn.course._16_java_collection_list_02_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//things to note 
//1. a LinkedList can have duplicates 
//2. A LinkedList can preserve insertion order 
//3. A LinkedList can have null values. 

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> colors = new LinkedList<>();
		
		//add elements to the list. 
		
		colors.addFirst("black");
		
		//adding elements to the end of the list 
		colors.addLast("blue");
		
		System.out.println("LinkedList after adding colors: " + colors);
		
		
		//remove element from the beginning 
		
		//colors.remove(0); 
		
		colors.removeFirst(); 
		//this will work too for removing the first element. 
		
		colors.removeLast(); 
		
		System.out.println("LinkedList after adding colors: " + colors);
		
		colors.add("blue");
		colors.add("blue"); 
		colors.add("pink");
		colors.add("white");
		colors.add("gold");
		colors.add("black");
		colors.add("purple");
		
		System.out.println("LinkedList after adding colors: " + colors);
		
		//removing an element. 
		
		//first remove an element from index 1 
		
		colors.remove(1); 
		System.out.println("LinkedList after removing element at index 1: " + colors);
		
		//add elements at Index 1 
		colors.add(1, "bronze");
		System.out.println("LinkedList after adding new element at index 1: " + colors);
		
		//trying to access elements in the List 
		//access elements at index 2 
		
		System.out.println("Access an element at index 2: " + colors.get(2));
		
		//adding some null values. 
//		colors.add(null); 
		//commenting the line above because using the .equals operator for a null value will throw an exception. 
		
		System.out.println("Updated LinkedList: " + colors);
		
		
		//Access elements in the LinkedList using a for loop 
		
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i)); 
		}

		
		//Accessing elements in the LinkedList using a for-each loop 
		
		for (String element : colors) {
			System.out.println(element);
			
		}
		
		//Accessing elements of the list using an Iterator 
		
		System.out.println("Accessing the elements using Iterator");
		Iterator<String> it = colors.iterator(); 
		
		while(it.hasNext()) {
			System.out.println("The next element using Iterator: " + it.next()); 
		}
		
//		System.out.println(it.next()); 
		
		//remove using Iterator (removing an element) 
		//while looping through it, you remove an element using Iterator
		Iterator<String> iterator = colors.iterator(); 
		while (iterator.hasNext()) {
		      String color = iterator.next();
		      if(color.equals("purple")) {
		        iterator.remove();
		        System.out.println("The color is removed successfully"); 
		      }
		    }
		
//Add an element using ListIterator (sub interface of Iterator) using a condition.

		ListIterator<String> listIterator = colors.listIterator(); 
		while(listIterator.hasNext()) {
			String color = listIterator.next(); 
			
			if (color.equals("black")) {
				listIterator.add("beige");
				System.out.println("Color added successfully"); 
			}
		}
		
		System.out.println("LinkedList after adding color: " + colors);
		
		}
		
		
	

}
