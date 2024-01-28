package com.training.shape;


public class OverloadDemo {

	public static void main(String[] args) {

		Shape shape= new Shape();
		shape.area(10.5);
		
		int res = shape.area(10,20);
		System.out.println("Rect" + res);
		
		double result = shape.area(10,10.5f);
		System.out.println("Tri: " + result);
		
	}

}
