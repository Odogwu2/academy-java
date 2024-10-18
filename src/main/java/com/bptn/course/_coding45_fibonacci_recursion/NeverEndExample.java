package com.bptn.course._coding45_fibonacci_recursion;

public class NeverEndExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		neverEnd(0); 
	

	}
	
	static void neverEnd (int num)
	{
		System.out.println("Never ends, num= " + num);
		neverEnd(num+1); 
	}

}
