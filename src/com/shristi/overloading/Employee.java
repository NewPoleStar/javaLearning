package com.shristi.overloading;

public class Employee {

	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	void calcBonus() {
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Designation: "+designation);
		System.out.println("Employee Allowance: "+"No Allowance");
	}
	void calcBonus(double basicAllowance) {
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Designation: "+designation);
		System.out.println("Employee Allowance: "+"Basic Allowance");
	}

	void calcBonus(double basicAllowance, double carAllowance) {
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Designation: "+designation);
		System.out.println("Employee Allowance: "+"Basic & Car Allowance" );
	}

	void calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Designation: "+designation);
		System.out.println("Employee Allowance: "+"Basic, Car & House Allowance");
	}

}
