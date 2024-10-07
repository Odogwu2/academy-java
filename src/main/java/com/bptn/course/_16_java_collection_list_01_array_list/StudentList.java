package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class StudentList {

	   // main method for testing
	   public static void main(String[] args) {
	      ArrayList<Student> roster = new ArrayList<>();
	      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
	      
	      // add your code here
	      
	      Student s2 = new Student("Ayanna", "ayanna@gmail.com", 789012);
	      roster.add(s2); //added the second student into ArrayList

	      System.out.println(roster);
	   }
}
