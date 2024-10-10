package com.bptn.course._university_challenge;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// Start by looking in the University and Student classes. Implement the methods. 

        	// Create a bunch of student objects
            // (Make sure one student has the following studentId: 123)
		Student student = new Student(123, "udanumudu1", "ixt%passw0rd", "Udochukwu", "Anumudu", "udamian@gmail.com", "6476717271", "Toronto", "Male", LocalDate.of(1992, 05, 18), "2024-09-23", 000010, "Full stack"); 
            
		// (Make sure one other student has the following username: testUsername1)
		Student student2 = new Student(1234, "testUsername1", "itc%pas0rd", "Udo", "Edward", "udamian@yahoo.com", "6479717271", "Burlington", "Male", LocalDate.of(1994, 1, 1), "2024-09-23", 000011, "Full stack"); 

        // Create instance of university called "university" and populate it with the students.
		University university = new University("Obsidi Academy", "Toronto");
		
		university.addStudent(student2);
		university.addStudent(student);
		
		university.getStudents(); 
		
		

        System.out.println("\nUniversity ------ \n" + university.getStudents());
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.getStudents());


	}

}
