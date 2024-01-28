package com.training.inheritance;

public class MyManager extends MyEmployee{

	double salary;
	
	public MyManager(String name, int empID, String city, double salary) {
		super(name, empID, city);
		this.salary = salary;
	}

	@Override
	void calcBonus(int amount) {
		System.out.println("Manager Salar " + salary * 3);
	}

	void funClub() {
		System.out.println("Fun Day");
	}


	
	
}
