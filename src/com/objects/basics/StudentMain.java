package com.objects.basics;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student(null, null);
		student.name = "Sam";
		student.major = "Electrical Engineering";
		student.getGrades(59,45,68,88,59,80);
		student.printDetails();
		
		// student = new Student(null, null);
		student.name = "Navjot";
		student.major = "Software Engineering";
		student.getGrades(89,92,98,91,95,80);
		student.printDetails();
	}

}
