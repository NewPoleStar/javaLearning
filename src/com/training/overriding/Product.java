package com.training.overriding;

public class Product extends Calculator{

	@Override
	void calculate(int x, int y) {
		System.out.println("Product" + x*y);
	
	}
	
	
	
	
}
