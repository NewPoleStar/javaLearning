package com.training.shape;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Vehicle();
		vehicle.getDetails();
		System.out.println();

		Vehicle vehicle1 = new Vehicle("Civic");
		vehicle1.getDetails();
		System.out.println();

		Vehicle vehicle2 = new Vehicle("Honda", "City");
		vehicle2.getDetails();
		System.out.println();

		Vehicle vehicle3 = new Vehicle("Toyota", "Tata", 1232);
		vehicle3.getDetails();
	}

}
