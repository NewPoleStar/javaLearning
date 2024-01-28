package com.training.shape;

public class VarArgsDemo {

	void sum(String name, int... marks) {
		System.out.println(name);
		System.out.println(marks.length);
		int total = 0;
		for (int m : marks) {
			total += m;
		}
		System.out.println(total);
	}
	void sum (String uname) {
		System.out.println("Welcome" + uname);
	}

	public static void main (String[]args) {
			VarArgsDemo demo = new VarArgsDemo();
			demo.sum("Sonu");
			demo.sum("Sonu", 90,89);
			demo.sum("Sonu", 90,80,90);
					
		}
}
