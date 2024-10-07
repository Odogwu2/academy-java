package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class listGetSet {

	public static void main(String[] args) {
		
		
	      ArrayList<String> nameList = new ArrayList<String>();
	      nameList.add("Diego");
	      nameList.add("Grace");
	      nameList.add("Deja");
	      System.out.println(nameList);
	      
	      
	      System.out.println(nameList.get(nameList.size()-1)); 
	      
	      nameList.set(0, "Udo");
	      
	      System.out.println(nameList);

	}

}
