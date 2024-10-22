package com.bptn.course._22_big_coding._list_to_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override 
	public String toString() {
		return "Student{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", age=" + age +
                '}';
	}

}

public class ListToMap {

	// create static method "convertStudentListToMap"
	
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
		Map<Integer, Student> studentMap = students.stream()
															.collect(Collectors
															.toMap(Student::getId, (student)-> student));
		
		return studentMap;
		
	}

	// Complete the main method
	public static void main(String[] args) {

		// Create a list of students
		List<Student> students = new ArrayList<>();
		

		// add student objects to this list
		
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));

		// Call "convertStudentListToMap" method and hold the returned value in
		// "studentMap" variable.
		
		Map<Integer, Student> studentMap = convertStudentListToMap(students);

		// Print the map
		System.out.println("Students Map: " + studentMap);
	}
}
