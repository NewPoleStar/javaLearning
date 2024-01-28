package com.training.inheritance;

public class FeaturePhone extends Mobile {

	String buttonType;
	
	public FeaturePhone(String brand, String model, double price, String buttonType) {
		super(brand, model, price);
		this.buttonType = buttonType;
		
	}
	void checkPhoneType() {
		if (this.equals("spongy")) {
			System.out.println("Print Premium Phone");
		}
		if (this.equals("Hard Print")) {
			System.out.println("Local Piece");
		}
		
	}
	
	
}
