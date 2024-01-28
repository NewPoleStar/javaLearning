package com.exercise.java;

public class Employee {

	String name;
	int salary;
	
	void getDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
	String greet(String msg) {
		return "Welcome, " + msg;
	}
}
