package com.training.abstractMethod;

public class Branch1 extends Bank{

	@Override
	void carLoan() {
		System.out.println("Car Loan in branch1");
	}

	@Override
	void houseLoan() {
		System.out.println("House Loan in branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("Education Loan in branch1");
	}

	void payLoan() {
		System.out.println("Pay Loan in branch1");
	}
	
	
	
		
	
}
