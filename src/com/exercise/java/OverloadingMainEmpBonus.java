package com.exercise.java;

public class OverloadingMainEmpBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingEmpBonus oleb = new OverloadingEmpBonus("James");
		OverloadingEmpBonus oleb1 = new OverloadingEmpBonus("James","Enginner");
		OverloadingEmpBonus oleb2 = new OverloadingEmpBonus("James","Enginner", 50000);
		OverloadingEmpBonus oleb3 = new OverloadingEmpBonus(2);
		OverloadingEmpBonus oleb4 = new OverloadingEmpBonus(2,(int)3.5);
		OverloadingEmpBonus oleb5 = new OverloadingEmpBonus(2,5);
		
//		oleb.getDetails();
//		oleb1.getDetails();
		oleb2.getDetails();
		oleb3.getDetails();
		oleb4.getDetails();
		oleb5.getDetails();
		
		
		
		
		
		
	}

	
}
