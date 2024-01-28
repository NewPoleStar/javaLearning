package com.training.inheritance;

public class AtmAccount {

	double balance;

	public AtmAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	void withDraw(double balance) {
		
		this.balance = balance;
	}
	void deposit(double balance) {
		this.balance = balance;
		
	}
	void getBalance(double balance) {
		return;
	}
	
}
