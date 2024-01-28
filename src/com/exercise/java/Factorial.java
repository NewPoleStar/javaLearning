package com.exercise.java;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Factorial Number: A factorial is a function that multiplies a number by every
		// number below it till 1.
		// repeat n*(n-1)
		int i; 
		int fact=1;
		int number=6;
		for (i=1; i<=number;i++) {
			fact= fact*i;
			System.out.println(fact);
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
