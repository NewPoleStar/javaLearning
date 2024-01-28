package com.training.overloading;

public class Demo {

	public Demo() {
		
		System.out.println("Hello");
	}
	
	public Demo(int x) {
		this("Raghu");
		System.out.println("Value of X: " + x);
	}
	
	public Demo(String s) {
		this();
		System.out.println("Welcome : " + s);
	}
	public static void main(String[] args) {
		
		Demo d1 = new Demo(10);
	}
}
