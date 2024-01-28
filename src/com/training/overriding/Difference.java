package com.training.overriding;

public class Difference extends Calculator {
	void calculate(int x, int y) {
		System.out.println("Difference" + (x-y));
	}
}
