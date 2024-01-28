package com.training.overriding;

public class Chinese extends Food{

	@Override
	String[] showMenus() {
		String[] chineseFood = {"FriedRice","Noodles","Soup"};
		return chineseFood;
	}

	
}
