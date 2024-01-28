package com.exercise.java;

public class ConsWorkingClass {

	String name;
	int salary;

	ConsWorkingClass(String n, int s) {
		name = n;
		salary = s;
	}

	void getDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	String greetMessage(String msg) {
		return msg;
	}
}
