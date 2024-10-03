package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		

	try {
		readFile("Result.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("An error occured: " + e.getMessage());
	}	

	}

	
	//create a method which reads a file. 
	public static void readFile(String fileName) throws FileNotFoundException {
	
	//create an object of FileReader
		FileReader fileReader = new FileReader(fileName);
	}
//	public static void callMethod() throws FileNotFoundException {
//		readFile("result.txt");
//	}
}


//throws must be included for any type of checked exception
//whenever you create an object using a constructor, or you call a method which has throws followed by any checked exception, java will give you two options to deal with it. 
//FileNotFoundException is a checked exception, where the Java compiler wants you to deal with it. 
//when we call a method which has a checked exception in the method signature, 
//Javac gives you two options, 
//Opt.1: To surround it with a try/catch 
//Opt.2: Add it again in the throws of the method signature. 