package com.training.abstractMethod;

public class AbsBankMain {

	public static void main(String[] args) {

		Bank bank = new Branch1();
		bank.carLoan();
		bank.eduLoan();
		bank.houseLoan();
		bank.admin();
		bank.rules();

		Branch1 branch1 = (Branch1)bank;
		branch1.admin();
		SubBranch subB = (SubBranch)bank;
		bank = new SubBranch();

		System.out.println("");
		bank.carLoan();
		bank.eduLoan();
		bank.houseLoan();
		bank.admin();
		bank.rules();

		subB.admin();
		subB.payInterest();
		subB.carLoan();
		subB.checkDeposit();
		subB.eduLoan();
		subB.admin();

	}

}