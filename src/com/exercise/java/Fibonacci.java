package com.exercise.java;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonacci sequence is a sequence in which each number is the sum of the two
		// preceding ones.

		int n1 = 0, n2 = 2, count = 16;
		
		// System.out.println(n1 +" "+ n2);
		for (int i = 2; i <= count; i++) {
			int n3 = n1 + n2;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
		}
	}
}
