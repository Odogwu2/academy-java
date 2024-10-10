package com.bptn.course._university_challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {

	// property - get inspired by the UML diagram
	//declaring the instance variables. 
//	private String major; 
	private String universityName;
	private String universityAddress;
	private List<Student> students;
//	private List<Course> courses; 
//	private List<Department> departments;  

	public University(String universityName, String universityAddress) {
		// this.major = major;
		this.universityName = universityName;
		this.universityAddress = universityAddress;
		this.students = new ArrayList<>(); // initializing the students as an ArrayList.
		// this.departments = new ArrayList<>();

	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityAddress() {
		return universityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student x) {
		// add a student to the "university" arraylist
		this.students.add(x);
	}

	public Student getStudent(long studentId) {
		for (Student student : students) // looping through the student list using a for-each loop.
		{
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
	}

	public List<Student> searchStudent(String userNamePrefix) {
		List<Student> studentMatch = new ArrayList<>();

		for (Student student : students) {
			if (student.getUserName().startsWith(userNamePrefix)) {
				studentMatch.add(student);
			}
		}
		return studentMatch;

		// return all students that have usernames beginning with the prefix
	}

	public boolean deleteStudent(long studentId) {
		Iterator<Student> it = students.iterator(); // using an iterator to remove an element while looping.
		while (it.hasNext()) {
			Student student = it.next(); // go over each element one at a time. 
			if (student.getStudentId() == studentId) // 
			{
				it.remove(); //Removes from the list the last element that was returned by next()
				return true;
			}
		}
		return false;
		// return if a successful deletion happened
	}

}
