package com.training.overriding;

public class Italian extends Food {

	@Override
	String[] showMenus() {
		
		String[] italianMenu = {"Pizza","Pasta","Italian Soup"};
		return italianMenu;
		
	}
	
		
}
