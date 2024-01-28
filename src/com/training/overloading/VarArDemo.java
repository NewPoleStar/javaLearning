package com.training.overloading;

public class VarArDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArDemo variableArgs = new VarArDemo();

		variableArgs.calcSum("Nilesh");
		variableArgs.calcSum("Tom", 94);
		variableArgs.calcSum("John", 32, 34, 54);
		variableArgs.calcString("Pritam", "Doland", "Kumar","King");
	}
	void calcSum(String name, int... b) {
		System.out.println("Welcome " + name);
		int sum = 0;
		for (int v : b) {
			sum = sum + v;
			System.out.println("Sum " + sum);
		}
	}
	void calcString(String... x) {
		for(String v: x) {
			System.out.println(v);
		}
		System.out.println("Have a goodday ");
	}
}
