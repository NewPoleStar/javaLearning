package com.training.overriding;

import java.util.Scanner;

public class OverrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for add, 2 for diff, 3 for prod");
		int choice = sc.nextInt();
		Calculator calculator = null;

		if (choice == 1) {
			calculator = new Adder();
			calculator.calculate(10, 20);
		}

		if (choice == 2) {
			calculator = new Product();
			calculator.calculate(10, 20);
		}
		if (choice == 3) {
			calculator = new Difference();
			calculator.calculate(10, 20);
		}
	}
}
