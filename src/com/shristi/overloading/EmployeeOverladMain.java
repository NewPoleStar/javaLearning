package com.shristi.overloading;

public class EmployeeOverladMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(null, null);

		employee.name = "Rajiv";
		employee.designation = "Manager";
		if(employee.designation == "Manager"){
			employee.calcBonus(0, 0);
		}else if (employee.designation=="Programmer") {
			employee.calcBonus(0);
		}else if (employee.designation== "Director") {
			employee.calcBonus(0, 0, 0);
		}else 
			System.out.println("No Bouns");
		
		employee.name = "Justin";
		employee.designation = "Director";
		if(employee.designation == "Manager"){
			employee.calcBonus(0, 0);
		}else if (employee.designation=="Programmer") {
			employee.calcBonus(0);
		}else if (employee.designation== "Director") {
			employee.calcBonus(0, 0, 0);
		}else 
			System.out.println("No Bouns");	
		
		employee.name = "Michael";
		employee.designation = "Programmer";
		if(employee.designation == "Manager"){
			employee.calcBonus(0, 0);
		}else if (employee.designation=="Programmer") {
			employee.calcBonus(0);
		}else if (employee.designation== "Director") {
			employee.calcBonus(0, 0, 0);
		}else 
			System.out.println("No Bouns");	
		
		employee.name = "Victor";
		employee.designation = "Temp";
		if(employee.designation == "Manager"){
			employee.calcBonus(0, 0);
		}else if (employee.designation=="Programmer") {
			employee.calcBonus(0);
		}else if (employee.designation== "Director") {
			employee.calcBonus(0, 0, 0);
		}else 
			employee.calcBonus();
	}

}
