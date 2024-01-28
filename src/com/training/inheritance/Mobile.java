package com.training.inheritance;

public class Mobile {

	String brand;
	String model;
	double price;
	public Mobile(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	
	void printOut() {
		System.out.println(brand +"" +model +""+ price);
	}
	
}
