package com.bptn.course._15_big_coding_wk2;

public class Triangle {
	
	//write perimeterCalculator method
	public int perimeterCalculator(int a, int b, int c) {
		int perimeter = a+b+c; 
		return perimeter; 
	}
	
	
	//write areaCalculator method. 
	public int areaCalculator(int b, int h) {
		int area = (b*h)/2; 
		return area; 
	}
	

	public static void main(String[] args) {
	
		Triangle object = new Triangle(); 
		int a = 7; 
		int b = 10; 
		int c = 35; 
		
		int perimeter = object.perimeterCalculator(a, b, c);
		int area = object.areaCalculator(7, 10); 
		
		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);

	}

}
