package com.training.overriding;

public class Indian extends Food{

	@Override
	String[] showMenus() {
		
		String[] indianMenu = {"Chapati","Rice","Daal"};
		return indianMenu;
	}
	

}

