package com.training.inheritance;

public class MyDeveloper extends MyEmployee{

	String training;


	
	public MyDeveloper(String name, int empID, String city, String training) {
		super(name, empID, city);
		this.training = training;
	}


	@Override
	void calcBonus(int amount) {
		System.out.println("My Dev "+ amount * 2);
	}


	void showCourses() {
		System.out.println(training);
	}
	
	
	
	
}
