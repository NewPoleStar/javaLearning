package com.training.shape;

public class Shape {

//	void area (int x) {
//		System.out.println("Square area " + x*x);
//	}
	
	int area(int x, int y) {
		return x*y;
	}
	
	void area(double x) {
		System.out.println("Circle PI value:" + Math.PI);
	}
	double area(int x, float y) {
		return 0.5 * x * y;
	}
}
