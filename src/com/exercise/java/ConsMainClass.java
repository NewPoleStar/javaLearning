package com.exercise.java;

public class ConsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsWorkingClass cwc = new ConsWorkingClass("Thomas", 15000);
			
		cwc.getDetails();
		String msg = cwc.greetMessage("sdjfsidjfos");
		System.out.println(cwc.greetMessage(msg));
		
		ConsWorkingClass cwc1 = new ConsWorkingClass ("Vicky", 10000);
		cwc1.getDetails();
		System.out.println(msg);

	}

}
