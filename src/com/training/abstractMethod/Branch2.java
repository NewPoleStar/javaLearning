package com.training.abstractMethod;

public abstract class  Branch2 extends Bank{


	@Override
	void houseLoan() {
		System.out.println("House Loan in Branch2");
	}

	@Override
	void eduLoan() {
		System.out.println("Education Loan in Branch2");
	}

	void checkDeposit() {
		System.out.println("Check Deposit in Branch2");
	}
	
	
}
