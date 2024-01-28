package com.training.inheritance;

public class Employee{
	public Employee(String name, int empID) {
		//super();
		this.name = name;
		this.empID = empID;
	}

	String name;
	int empID;
	
	void print() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + empID);
	}
	
	
}
