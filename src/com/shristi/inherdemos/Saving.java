package com.shristi.inherdemos;

public class Saving extends Account{

	double savingBalance;
	public Saving(String name, double balance, double savingBalance, double currentBalance, double amount) {
		super(name, balance, savingBalance, currentBalance, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withDraw() {
		 super.withDraw();
		balance = savingBalance - amount;
	}

	@Override
	void deposit() {
		 super.deposit();
		balance = savingBalance + amount;
	}

	double getBalance() {
		return balance;
	}
	
	

	
	
}

	