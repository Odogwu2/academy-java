package com.bptn.course._university_challenge;

public class University extends Student{
	
	private String major; 
	private String universityName; 
	private String universityAddress; 
	private String userNamePrefix; 
	
	
	// property - get inspired by the UML diagram
//	public University() {
//		
//	}
	
	public University(long studentId, String userName, String password, String firstName, String lastName, String email, String phone, String address,String gender, String birthdate, String admissionDate, long rollNumber, String curriculumName, String major, String universityName, String universityAddress, String userNamePrefix) {
		
		super(studentId, userName, password, firstName, lastName, email, phone, address, gender, birthdate, admissionDate, rollNumber, curriculumName);
		this.major = major; 
		this.universityName = universityName; 
		this.universityAddress = universityAddress; 
		this.userNamePrefix = userNamePrefix; 
	}
	
	
	

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
    }

    public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
    }

}
