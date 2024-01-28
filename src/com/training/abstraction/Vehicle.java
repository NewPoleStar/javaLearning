package com.training.abstraction;

public abstract class Vehicle {

		abstract void getMileage();
		abstract void getAccessories();
			
		void showDetails (){
			System.out.println(" No Inventory Vehicle.");
		}
	
}
