package com.bptn.course._15_big_coding_wk2;

public class Employee {
	
	//declaring the instance variables for employee
	private int salary; 
	private int hoursPerDay; 
	
	//use constructor to set instance variables (salary & hoursPerDay)
//	public Employee(int salary, int hoursPerDay) {
//		this.salary = salary; 
//		this.hoursPerDay = hoursPerDay; 
//	}
	
	public Employee(int salary, int hoursPerDay) {
		setSalary(salary); 
		setHoursPerDay(hoursPerDay);
	}
	
	
	public void setSalary(int salary) {
		if(salary<500) {
			this.salary = salary + 10; 
		}else {
			this.salary = salary; 
		}
	}
	
	public void setHoursPerDay(int hoursPerDay) {
		if(hoursPerDay>6) {
			this.salary = salary + 5; 
		}this.hoursPerDay = hoursPerDay; 
	}
	
	public int getSalary() {
		return this.salary; 
	}
	
//	public int getHoursPerDay() {
//		return hoursPerDay; 
//	}


}
