package com.training.shape;

public class Vehicle {

	String model;
	String brand;
	double price;

	public Vehicle() {
		super();
		 System.out.println("-- No args --");
	}

	public Vehicle(String model) {

		this.model = model;
		 System.out.println("One args " + model);
	}

	public Vehicle(String model, String brand) {
		this(model);
		// this.model = model;
		this.brand = brand;
		 System.out.println("2 args " + model + " " + brand);
	}

	public Vehicle(String model, String brand, double price) {
		// this.model = model;
		// this.brand = brand;
		this(model, brand);
		this.price = price;
		 System.out.println("3 args " + model + " "+brand +" "+ price);
	}

	void getDetails() {
		if (model != null) {
			System.out.println("Model: " + model);
		}

		if (brand != null) {
			System.out.println("Brand" + brand);
		}

		if (price <= 0) {
			System.out.println("Price" + price);
		}

	}

}
