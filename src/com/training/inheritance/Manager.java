package com.training.inheritance;

public class Manager extends Employee{
	public Manager(String name, int empID, double salary) {
		super(name, empID);
		this.salary = salary;
	}

	double salary;	
	
	void calBonus(double amount) {
		double sum = amount + salary;
		System.out.println("Manager Salary: " + salary);
		System.out.println("Sum" + sum);
	}
}
