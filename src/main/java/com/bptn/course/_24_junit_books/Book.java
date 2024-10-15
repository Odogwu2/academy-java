package com.bptn.course._24_junit_books;

public class Book {
	
	private String title; 
	private double price; 
	
	public Book(String title, double price) {
		this.title = title; 
		this.price = price; 
	}

	public String getTitle() {
		return this.title;
	}
	
	public String getBookInfo() {
		return this.title + "-" + this.price; 
	}

//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}

}
