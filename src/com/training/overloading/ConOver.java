package com.training.overloading;

public class ConOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample sample = new Sample (1);
		Sample sample1 = new Sample (10);
		Sample sample2 = new Sample (10,20);
		Sample sample3 = new Sample (100,200);
		
		sample.calcSum();
		sample1.calcSum();
		sample2.calcSum();
		sample3.calcSum();
	}

}
