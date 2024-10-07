package com.bptn.course._16_java_collection_list_01_array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// 1st way of declaring ArrayList 
		
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		
		
		//another way 
		List<Integer> arrayList1 = new ArrayList<>(); 

		
		//accessing elements using a for loop 
		//preferred when the collection is indexed
		for (int i = 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		// accessing using for each loop 
		//when you want to access elements in a collection that's not indexed. 
		for (Integer element : arrayList) {
			System.out.println(element); 
		}
	}

}


//<> diamond operator -> Java Generics
//2. we need to rely on abstraction rather than concrete implementation 
//3. First way of declaring is relying on concrete implementation which doesn't follow Dependency Inversion 
//4. 2nd way of declaring is following abstraction. 