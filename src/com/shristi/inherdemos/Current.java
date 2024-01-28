package com.shristi.inherdemos;

public class Current extends Account{

	
	double currentBalance;
	
	public Current(String name, double balance, double savingBalance, double currentBalance, double amount) {
		super(name, balance, savingBalance, currentBalance, amount);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	void withDraw() {
		// TODO Auto-generated method stub
		super.withDraw();
		balance = currentBalance - amount;
	}

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		balance = currentBalance + amount;
	}

	double getBalance() {
		return balance;
		
	}
	

	
}
