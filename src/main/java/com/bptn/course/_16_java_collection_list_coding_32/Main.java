package com.bptn.course._16_java_collection_list_coding_32;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Student1", 80));
        studentList.add(new Student("Student2", 75));
        studentList.add(new Student("Student3", 86));
        studentList.add(new Student("Student4", 74));
        studentList.add(new Student("Student5", 92));
        studentList.add(new Student("Student6", 72));
        studentList.add(new Student("Student7", 60));

        // initialize passList
        List<Student> passList = new ArrayList<>();

        // Loop through studentlist to filter the students with target grade
        
        
        //using Student for the loop because each object is of type Student. 
        for(Student s : studentList) {
        	if (s.getClassGrade() >= 75) {
        		passList.add(s); 
        	}
        }

        // print out the students using a for-each loop. 
        for(Student s : passList) {
        	System.out.println(s); 
        }
    }
}