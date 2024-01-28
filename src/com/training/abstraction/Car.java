package com.training.abstraction;

public abstract class Car extends Vehicle{

	@Override
	abstract void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("Car Mileage");
	}

	@Override
	abstract void getAccessories() {
		// TODO Auto-generated method stub
		System.out.println("Car Accessories");
	}
	

	
	

	
}
