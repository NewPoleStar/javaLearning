package com.training.overloading;

public class Student {

	String name, city;
	int studentID;

	// constructor
	public Student() {
		System.out.println("Default Mode ...");
	}

	public Student(String name, int sid) {
		this.name = name;
		this.studentID = sid;
	}

	public Student(String name, String city, int studentID) {
		super();
		this.name = name;
		this.city = city;
		this.studentID = studentID;
	}

	void getDetails() {
		System.out.println("");
		if (name != null) {
			System.out.println(name);
		}
		if (city != null) {
			System.out.println(city);
		}
		if (studentID > 0) {
			System.out.println(studentID);
		} else
			System.out.println("*No Input*");

	}

}
