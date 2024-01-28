package com.exercise.java;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Prime Number: A whole number greater than 1 that cannot be exactly divided by any whole number other than itself.
		// very useful in cryptography.
		
		int num=8,x=2;
		while(x<=(num/2)) {
			if (num%x==0) {
				System.out.println(num + "is not a prime number");
				x++;
			}
		// }
		System.out.println(num + "is a prime number");
	}
}
