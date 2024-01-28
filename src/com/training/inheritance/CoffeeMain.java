package com.training.inheritance;

public class CoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeePro coffeePro = new CoffeePro(null,0);
		
		coffeePro.name = "Java Beans";
		coffeePro.price	= 3500;
		
		coffeePro.getOrders();
		String msg = coffeePro.greetMessage("Enjoy your coffee");
		System.out.println(msg);
		System.out.println("");
		
		CoffeePro coffeePro2 = new CoffeePro(null,0);
		coffeePro2.name = "Lava Beans";
		coffeePro2.price = 4000;
		coffeePro2.getOrders();
		String msg2 = coffeePro.greetMessage("Enjoy hot coffee");
		System.out.println(msg2);
		
	}

}
