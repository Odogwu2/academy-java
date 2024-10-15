package com.bptn.course._004_generics_teachback;



public class Boom <T>{
	
	T obj; 
	
	//create a constructor 
	//since we don't know yet what type of variable we want to pass in to 
	//initialize obj, we can just do this: 
	
	Boom(T obj){
		this.obj = obj; 
	}
	
	//method to print out the type of our variable. 
	
	void showType() {
		System.out.println(obj.getClass().getName());
	}
	

}
