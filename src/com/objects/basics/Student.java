package com.objects.basics;

public class Student {

	String name;
	String major;
	String grade;

	public Student(String name, String major) {
		super();
		this.name = name;
		this.major = major;
	}

	void printDetails() {
		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("major: " + major);
		System.out.println("Grade: " + grade);
	}

	String getGrades(int... marks) {
		int sum = 0;
		for (int m : marks) {
			sum += m;
		}
		int ave = sum / marks.length;
		if (ave >= 90 && ave < 100) {
			grade = "A";
			return grade;
		} else if (ave >= 80 && ave < 90) {
			grade = "A";
			return grade;
		} else if (ave >= 70 && ave < 80) {
			grade = "B";
			return grade;
		} else if (ave >= 60 && ave < 70) {
			grade = "C";
			return grade;
		} else if (ave >= 50 && ave < 59) {
			grade = "D";
			return grade;
		} else
			grade = "Fail";
		return grade;
	}

}
