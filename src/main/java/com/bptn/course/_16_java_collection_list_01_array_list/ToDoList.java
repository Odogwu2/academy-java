package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class ToDoList {

	public static void main(String[] args) {
		// Rewrite this code to use an ArrayList instead of an array
//	      String[] toDoList = new String[3];
//	      toDoList[0] = "Do homework";
//	      toDoList[1] = "Help make dinner";
//	      toDoList[2] = "Call grandma";
	      
	      ArrayList<String>toDoList = new ArrayList<>(); 
	      
	      toDoList.add(0, "Do homework"); 
	      toDoList.add(1, "Help make dinner");
	      toDoList.add(2, "Call grandma");

//	      // changing element at index 1
//	      toDoList[1] = "Order pizza";
	      
	      toDoList.set(1, "Order pizza"); 

//	      System.out.println(toDoList.length + " things to do!");
//	      System.out.println("Here's the first thing to do: "
//	           + toDoList[0] );
	      
	      System.out.println(toDoList.size() + " things to do!");
	      System.out.println("Here's the first thing to do: " + toDoList.get(0));
	      
	      toDoList.remove(0); 
	      System.out.println("Here's the next thing to do: " + toDoList.get(0));
	      

	      // remove item 0 and move everything down
	      //  (this can be done in 1 command with ArrayList)
//	      toDoList[0] = toDoList[1];
//	      toDoList[1] = toDoList[2];
//	      toDoList[2] = "";
//
//	      System.out.println("Here's the next thing to do: "
//	           + toDoList[0] );

	}

}
