package com.training.shape;

public class Demo {

	Demo(){
		this(10);
		System.out.println("Hello");
		}
	
	Demo (int x){
		this("Sonu");
		System.out.println("Value" + 10);
	}
	Demo (String x){
		System.out.println("Welcom " +x);
	}
	
	public static void main (String[] args) {
		
		Demo demo = new Demo();
		
	}
	
}
