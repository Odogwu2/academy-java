package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class Student {
	
	   private String name;
	   private String email;
	   private int id;

	   public Student(String initName, String initEmail, int initId) {
	      name = initName;
	      email = initEmail;
	      id = initId;
	   }

	   // toString() method
	   public String toString() {
	     return id + ": " + name + ", " + email;

	}

}
