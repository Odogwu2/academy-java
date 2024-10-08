package com.bptn.course._17_iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> names = new LinkedList<>(); 
		names.push("Lani");
		names.push("Yemisi");
		names.push("Asabi");
		
		
		
		names.add(2, "Oludare");
		
		
		Iterator<String> it = names.iterator(); 
		
//		ListIterator<String> it = names.listIterator();
// 		if i use this declaration 
		// i will be able to say it.next(); 
		// i will also be able to use it.add(); 
		

//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String s: names) {
			System.out.println(s);
		}
		
//		System.out.println(names.pop()); 
//		System.out.println(names.removeFirst());
//		System.out.println(names.remove());
	}

}
