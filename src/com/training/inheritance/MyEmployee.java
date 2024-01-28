package com.training.inheritance;

public class MyEmployee {

	String name;
	int empID;
	String city;
	
	public MyEmployee(String name, int empID, String city) {
		super();
		this.name = name;
		this.empID = empID;
		this.city = city;
	}

	void print() {
		System.out.println("Employee Name " + name);
		System.out.println("Employee ID " + empID);
		System.out.println("Employee City "+ city);
	}
	
	void calcBonus(int amount) {
		System.out.println("Employee Bonus: " + amount);
	}
}
