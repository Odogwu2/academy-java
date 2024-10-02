package com.bptn.course._07_oop;

public class Person {

	private String name;
	private String email;

	public Person(String initName, String initEmail) {
		name = initName;
		email = initEmail;
	}

	public String toString() {
		for (int i = 0; i < 5; i++) {
			int id = i;
			// Can you access the blockScope variables i or id?
			System.out.println("i at the end of the loop is " + i);
			System.out.println("The last id is " + id);

		}
		// // Can you access the blockScope variables i or id?
		// System.out.println("i at the end of the loop is " + i);
		// System.out.println("The last id is " + id);

		// Can toString() access parameter variables in Person()?
		return name + ": " + email;
	}

	// main method for testing
	public static void main(String[] args) {
		// call the constructor to create a new person
		Person p1 = new Person("Sana", "sana@gmail.com");
		System.out.println(p1);
	}
}
