package com.training.overloading;

public class MainMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Mobile mobile1 = new Mobile();
//		Mobile mobile2 = new Mobile("A-5256");
		Mobile mobile3 = new Mobile("I-4522", 15000.00);
		Mobile mobile4 = new Mobile("D-8554","Samsung",18000);
		
//		mobile1.getDetails();
//		mobile2.getDetails();
		mobile3.getDetails();
		mobile4.getDetails();
		
		
	}

}
