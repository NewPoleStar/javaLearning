package com.shristi.inherdemos;

import java.io.InputStream;
import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		// User enter name
		// User select the saving or current account
		// User withdraw or deposit to saving or current account.

		Account account = new Account(null, 0, 0, 0, 0);
		account.currentBalance = 3000;
		account.savingBalance = 4000;

//		account.getBalance();
//		Saving saving = Saving(account);
//		saving.getBalance();
//		Current current = Current(account);
//		current.getBalance();

		System.out.println("Enter 1 for saving and 2 for checking account");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input == 1) {
			System.out.println("Enter 3 for withdraw and 4 for deposit of saving account");
			int trans = scanner.nextInt();
			if (trans == 3) {
				System.out.println("Enter withdraw amount:");
				account.amount = scanner.nextDouble();
				account.withDraw();
				account.getBalance();
				// get savingBalance and Total Balance
			}
			if (trans == 4) {
				System.out.println("Enter deposit amount:");
				account.amount = scanner.nextDouble();
				account.deposit();
				account.getBalance();
				// get savingBalance and Total Balance
			}
			if (input == 2) {
				System.out.println("Enter 3 for withdraw and 4 for deposit of checking account");
				trans = scanner.nextInt();
				if (trans == 3) {
					System.out.println("Enter withdraw amount:");
					account.amount = scanner.nextDouble();
					account.withDraw();
					account.getBalance();
					// Get current/checking and total balance
				}
				if (trans == 4) {
					System.out.println("Enter deposit amount:");
					account.amount = scanner.nextDouble();
					account.deposit();
					account.getBalance();
					// get current/checking and total balance.
				}

			}
		}

	//}



}
