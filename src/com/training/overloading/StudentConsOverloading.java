package com.training.overloading;

public class StudentConsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		student1.getDetails();
		Student student2 = new Student("Robert",22);
		student2.getDetails();
		Student student3 = new Student("Philip","Hilsburg",25);
		student3.getDetails();
		Student student4 = new Student("Riya","Bangalore",19);
		student4.getDetails();
	}

}
