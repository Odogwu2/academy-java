package com.bptn.course._100_practice;

import java.util.Scanner;

public class MobileApp {
//	private String email; 
//	private String phone; 
//	private String address; 
//	private int userID; 
//
//	
//	public MobileApp (String email, String phone, String address, int userID) {
//		this.email = email; 
//		this.phone = phone; 
//		this.address = address; 
//		this.userID = userID++; 
//	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Welcome to Coterie");
//		String email = "";
//		String phone = ""; 
//		int num = 0; 
//		String endsWithDotCom = ".com"; 
		
		int proceed = 0; 
		String email = ""; 
		String phone = ""; 
		
//		do {
			System.out.println("Please select the country you're registering from"); 
			System.out.println("1. Canada \n2. Nigeria \n3. Kenya");
			
			
			int num = scanner.nextInt(); 
			
			if(num == 1) {
				System.out.println("Please enter your email address.");
				scanner.nextLine(); 
				
				email = scanner.nextLine();
				System.out.println("Please enter your phone number.");
				phone = scanner.nextLine(); 
//			}
			
			
//		}while (proceed ==1); 
		
		
//		
//		System.out.println("Please enter your email address.");
//		email = scanner.nextLine(); 
//		
//		System.out.println("Please enter your phone number");
//		phone = scanner.nextLine(); 
//		
//		if (num.length() == 10) {
//			System.out.println("Kindly enter the 4 digit code sent to your phone");
//			
//		}else {
//			System.out.println("Your phone number length does not match."); 
//		}
//		
		
		
//		if(email.endsWith(com) = com) {
//			System.out.println("Enter your phone number"); 
//			num = scanner.nextInt(); 
//		}else {
//			System.out.println("Please enter a valid email"); 
//			email = scanner.nextLine(); 
//		}
//		
//		System.out.println("Press 1 to continue or press any other key to exit"); 
//		if (i = scanner.nextInt()) {
//			
//			
//		}
		
		scanner.close(); 
			}
	}

}
