package com.bptn.course._21_java_threads._coding_39;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {

	// Declare an instance variable of type List<Integer>
	
	List<Integer> list; 

	// Create a parameterized constructor.
	//calling a constructor from the super class Thread, it comes with a String name parameter. Hence the super(name) 
	public MyThread(String name, List<Integer> list) {
		super(name); 
		this.list = list; 
	}

	// Override the run() method here.
	
	@Override 
	public void run() {
		ListUtils.insertNextId(list);//putting this in here because we want to perform the method in two separate threads. 
	}
}
