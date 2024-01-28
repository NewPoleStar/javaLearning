package com.training.inheritance;

public class SmartPhone extends Mobile {

	String []apps;


	public SmartPhone(String brand, String model, double price, String[] apps) {
		super(brand, model, price);
		this.apps = apps;
	}

	void printOut() {
		System.out.println("Simple Phone");
	}

	
		
		

}
