package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class ParallelTests {


	    public static void main(String[] args) {
	        // Initialize the ArrayLists for test grades
	        ArrayList<Integer> test1Grades = new ArrayList<>();
	        ArrayList<Integer> test2Grades = new ArrayList<>();

	        // Add grades to the test lists
	        test1Grades.add(100);
	        test2Grades.add(100);
	        test1Grades.add(80);
	        test2Grades.add(70);
	        test1Grades.add(70);
	        test2Grades.add(90);

	        // Calculate total grades and the number of grades
	        double total = calculateTotal(test1Grades, test2Grades);
	        int numberOfGrades = test1Grades.size() + test2Grades.size();

	        // Print the average
	        System.out.println("Average over two tests: " + (total / numberOfGrades));
	        
	        System.out.println(total); 
	    }

	    private static double calculateTotal(ArrayList<Integer> test1, ArrayList<Integer> test2) {
	        double total = 0;

	        // Loop through both grade lists and calculate the total
	        for (int i = 0; i < test1.size(); i++) {
	            total += test1.get(i) + test2.get(i);
	        }
	        return total;
	    }
	}