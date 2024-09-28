package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class StringPluralizer {

	public static void main(String[] args) {
		
		//Initialize the scanner method
		//Ask the user to enter a number 
		//number must be a +ve value 
		//Ask the user to enter a word 
		
		Scanner sc = new Scanner(System.in);
		
		int amt = 0; 
		String word; 
		String endsWithY = "ies";
		String endsWithFe = "ves"; 
		String endsWithUs = "i";
		
		
		System.out.println ("Enter a number: "); 
		amt = sc.nextInt();
		
		if (amt < 0) {
			System.out.println ("Enter zero or a positive number");
			return;
		}
		
		//do {
		sc.nextLine();
		System.out.println ("Enter a word: ");
		word = sc.nextLine(); 
		
		if (amt == 1) {
			System.out.println(amt + " " + word);
			
		/*} 
		//else if (amt < 0){
			//System.out.println ("Enter zero or a positive number"); 
			 */
			
		} else if (word.endsWith("y")) {
			String modifiedForY = word.substring(0, word.length() -1) + endsWithY; 
			System.out.println(amt + " " +modifiedForY);
			
		} else if (amt >= 0 && word.endsWith("y")) {
			String modifiedForY = word.substring(0, word.length() -1) + endsWithY; 
			System.out.println(amt + " " +modifiedForY);
			
		} else if (amt >= 0 && word.endsWith("fe")) {
			String modifiedForFe = word.substring(0, word.length() -2) + endsWithFe; 
			System.out.println(amt + " " +modifiedForFe);
			
		} //else if (amt == 1) {
			//System.out.println(amt + " " + word); 
			
		//} 
			else if (amt >= 0 && word.endsWith("us")) {
			String modifiedForUs = word.substring(0, word.length() -2) + endsWithUs; 
			System.out.println(amt + " " +modifiedForUs);
			
		} else if (amt >= 0 && word.endsWith("sh")) {
			String modifiedForSh = word + "es"; 
			System.out.println(amt + " " + modifiedForSh);
			
		} else if (amt >= 0 && word.endsWith("ch")) {
			String modifiedForCh = word + "es"; 
			System.out.println(amt + " " + modifiedForCh);
			
		} else if (amt < 0){
			System.out.println ("Enter zero or a positive number"); 
		} else if (amt >= 0) {
			System.out.println (amt + " " + word + "s"); 
		} else {
			System.out.println (amt + " " + word + "s");
		}
		sc.close();
		
		//else (amt >= 0 && word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
			//System.out.println(amt + " " + "s"); 
			
		//}
		
		//else if (amt <=0) 
		
		//} while (amt == 0);

	}

}


//if (amt < 0) {
	//System.out.println("Please enter a zero or positive number.");
//} 