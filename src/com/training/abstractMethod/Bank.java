package com.training.abstractMethod;

public abstract class Bank {

	abstract void carLoan();
	abstract void houseLoan();
	abstract void eduLoan();
	
	void admin(){
		System.out.println("Admin");
	}
	
	final void rules() {
		System.out.println("Company rules");
		policies();
		
	}
	
	private void policies() {
		System.out.println("Confidential");
	}
	
	
}
