package com.training.overriding;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food food = null;
		System.out.println("Select from Chinese, Italian, Indian: ");
		Scanner scanner = new Scanner(System.in);
		String foodOrder = scanner.next();

		if (foodOrder.equals("Chinese")) {
			food = new Chinese();
		} else if (foodOrder.equals("Italian")) {
			food = new Italian();
		} else if (foodOrder.equals("Indian")) {
			food = new Indian();
		} else {
			food = new Food();
		}

		String[] items = food.showMenus();
		for (String item : items) {
			System.out.println(item);

		}

	}
}
