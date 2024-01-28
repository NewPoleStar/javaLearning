package com.training.abstraction;

import java.util.Scanner;

import com.training.overriding.Chinese;
import com.training.overriding.Food;
import com.training.overriding.Indian;
import com.training.overriding.Italian;

public class AbsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = null;
		vehicle = new Car();
		vehicle = new Truck();
		vehicle = new MiniVan();
		
		System.out.println("Select vehicle");
		Scanner scanner = new Scanner(System.in);
		String selectVehicle = scanner.next();
		
		if (selectVehicle.equals("Car")) {
			vehicle = new Car();
		} else if (selectVehicle.equals("Truck")) {
			vehicle = new Truck();
		} else if (selectVehicle.equals("MiniVan")) {
			vehicle = new Truck();
		} else {
			vehicle showDetials();
		}

		String[] items = food.showMenus();
		for (String item : items) {
			System.out.println(item);
		

		
		
		
	}

}
