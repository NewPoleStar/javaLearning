package com.exercise.java;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Perfect Number: is a positive number that is equals to the sum of its
		// positive divisors.
		// (x<=n/2);(n%x==0)

		int num = 12;
		int x = 1;
		int sum = 0;
		while (x <= num/2) {
			if (num % x == 0) {
				sum += x;
				System.out.println(x);
			}
			x++;
		}
		if (sum == num) {
			System.out.println(num + " is a perfect Number");
		} else {
			System.out.println(num + " is not a perfect Number");
		}

	}
}
