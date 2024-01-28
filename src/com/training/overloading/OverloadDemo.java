package com.training.overloading;

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new Shape();
		
		shape.calcArea(10);
		shape.calcArea(10.5f);
		System.out.println("");
		
		shape.calcArea((int) 10.5f); // upcasting, downcasting
		System.out.println("");
		int area = shape.calcArea(100, 200);
		System.out.println("Rect " + area);
		System.out.println("Tri " + shape.calcArea(10, 10.5f));
	
		double output = shape.calcArea(100, 200);
		System.out.println("Print " + output);
	}

}
