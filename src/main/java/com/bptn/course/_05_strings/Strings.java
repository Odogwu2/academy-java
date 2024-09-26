package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
	String s = "Hello World";	
	
	String ReversedWord = "";
	
	//Find the total length of the string and store it in a variable
	int stringLength = s.length (); 
	
	System.out.println ("" + stringLength);
	
	//substring() method - to get a part of the String 
	//String sub = s.substring(stringLength, stringLength);
	
	String sub = s.substring(0, 5); //overloaded substring method
	
	System.out.println ("The substring with start index 0 and end index 5: " + sub);
	
	//System sub1 = s.substring(stringLength);//method 
	
	String sub1 = s.substring(3); 
	
	System.out.println (sub1);
	
	
	
	String sub2 = s.toLowerCase();//toLowerCase() converts all the letters of the string to lowercase
	System.out.println (sub2);
	
	
	String sub3 = s.toUpperCase();//toUpperCase() converts all the letters of the string to uppercase 
	System.out.println (sub3);
	
	
	int index = s.indexOf("World");//Looking for the first occurrence of the specified substring
	System.out.println("The index of the World is: " + index);
	
	//find the character at the specified index 0
	char c = s.charAt(0);
	System.out.println ("The character at index 0: " + c);
	
	
	for (int i = s.length()-1 ; i>=0; i--) {
		ReversedWord += s.charAt(i); //getting the reversed word i.e., string value backwards
	}
	System.out.println (ReversedWord);
	
	}
}
