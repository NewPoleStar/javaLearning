package com.training.inheritance;

public class CoffeePro {

	String name;
	int price;
	
	public CoffeePro(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void getOrders() {
		System.out.println("Coffee Type: " + name);
		System.out.println("Coffee Price: " + price);
	}
	
	String greetMessage(String msg) {
		return msg;
	}
	
}
