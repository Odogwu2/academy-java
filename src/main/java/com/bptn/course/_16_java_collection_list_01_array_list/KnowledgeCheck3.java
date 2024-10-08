package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;

public class KnowledgeCheck3 {
	 public static void removeLongStrings(ArrayList<String> list) {
	        //code here
		 list.removeIf(words -> words.length() > 4);
	    }

	    public static void main(String[] args) {
	        //instantiate ArrayList and fill with Strings
	        ArrayList<String> values = new ArrayList<String>();
	        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
	        for (int i = 0; i < words.length; i ++) {
	            values.add(words[i]);
	        }
	        removeLongStrings(values);
	        System.out.println("Expected Result:\t [fish, cat, foo]");
	        System.out.println("Your Result:\t\t " + values);
	  }
}