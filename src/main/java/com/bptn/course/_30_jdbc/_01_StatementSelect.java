package com.bptn.course._30_jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bptn.course._30_jdbc.bean.Student;

public class _01_StatementSelect {

	public static void main(String[] args) {
		
		
		String dbURL = "jdbc:postgresql://localhost:5433/bptn";
		String dbUsername = "postgres";
		String dbPassword = "pg123";
		
		//create an arrayList of the student object. 
		List<Student> students = new ArrayList<>(); 
		
		String sql = "SELECT * FROM students ORDER BY \"studentId\"";
		//using the \ to treat it as the columnName itself "studentName" and not studentName. 
		
		try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			
			while (rs.next()) {
				
				// fetching the attributes for each row. 
				
				int studentId = rs.getInt("studentId");
				
				int courseId = rs.getInt("courseId");
				
				String studentName = rs.getString("studentName");
				
				String studentEmail = rs.getString("studentEmail");
				
				String studentPhone = rs.getString("studentPhone");
				
				/*
				 * since i'm creating this new student object in my while loop, 
				 * it will create the number of students in my table. 
				 */
				Student student = new Student(); 
				
				
				//setting the student attributes for each student 
				//using the setters in the student class. 
				student.setStudentId(studentId);
				student.setCourseId(courseId);
				student.setStudentName(studentName);
				student.setStudentEmail(studentEmail);
				student.setStudentPhone(studentPhone);
				
				students.add(student); 
				//adding the student to the ArrayList.
				//outside the while loop, i can then access other students from this ArrayList. 
			}
			
			//once outside our loop, we can now print. 
			//this should print in the order stated by the ORDER BY in our query. 
			students.forEach(student-> System.out.println(student));
			
			
			
			//System.out.println("Connection was successful");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
