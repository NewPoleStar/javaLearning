package com.training.overriding;


public class Adder extends Calculator {

	void calculate(int x, int y) {
		System.out.println("Sum" + (x+y));
	}
}
