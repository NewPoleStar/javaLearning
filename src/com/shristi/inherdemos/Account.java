package com.shristi.inherdemos;

public class Account {

	String name;
	double balance;
	double savingBalance;
	double currentBalance;
	double amount;
	
	public Account(String name, double balance, double savingBalance, double currentBalance, double amount) {
		super();
		this.name = name;
		this.balance = balance;
		this.amount = amount;
		// this.savingBalance = savingBalance;
		// this.currentBalance = currentBalance;
		this.amount = amount;
	}
	
		void withDraw() {
			System.out.println("Withdrawing...");
		}
		void deposit() {
			System.out.println("Depositing...");		
		}
		double getBalance() {
			return balance;
		}
}

