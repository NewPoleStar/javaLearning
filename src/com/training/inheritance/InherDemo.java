package com.training.inheritance;

public class InherDemo {

	public static void main(String[] args) {

		Employee emp = new Employee("Sir",234);
	
		Manager mgr = new Manager("Sam",3435,7000);
		
				emp.print();
				mgr.print();
				mgr.calBonus(5000);
						

	}
}
