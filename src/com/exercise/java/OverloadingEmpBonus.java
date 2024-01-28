package com.exercise.java;

public class OverloadingEmpBonus {

	String empName, empDesignation;
	// static double empSalary; // Why this need to be static?
	int empSalary;
	int bonus, carAllowance, houseAllowance;
	
	public OverloadingEmpBonus(String empName) {
		super();
		this.empName = empName;
	}

	public OverloadingEmpBonus(String empName, String empDesignation) {
		this(empName);
		this.empName = empName;
		this.empDesignation = empDesignation;
	}

	public OverloadingEmpBonus(String empName, String empDesignation, int empSalary) {
		this(empDesignation);
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}

	public OverloadingEmpBonus(int bonus) {
		// help with typecasting, in case empSalary in double data type?
		
		this.bonus = bonus;
		bonus = (empSalary + (empSalary * bonus/100));
		return;
	}

	public OverloadingEmpBonus(int bonus, int carAllowance) {
		this(bonus);
		this.bonus = bonus;
		this.carAllowance = (empSalary + (empSalary * carAllowance/100));
		return;
	}

	public OverloadingEmpBonus(int bonus, int carAllowance, int houseAllowance) {
		this(carAllowance);
		this.bonus = bonus;
		this.carAllowance = carAllowance;
		this.houseAllowance = (empSalary + (empSalary * houseAllowance));
	}

	void getDetails(){
		if (empName != null) {
			System.out.println(empName);
		}
		if (empDesignation != null) {
			System.out.println(empDesignation);
		}
		if (empSalary>0) {
			System.out.println(empSalary);
		}
		if (bonus>0) {
			System.out.println(bonus);
		}
		if (carAllowance>0) {
			System.out.println(carAllowance);
		}
		if (houseAllowance>0) {
			System.out.println(houseAllowance);
		}
		else
			System.out.println("Not Available");
	}
	
	
	

	
		
	
	
	
	
	
}
