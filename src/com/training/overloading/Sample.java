package com.training.overloading;

public class Sample {

	int x, y;
	Sample(){
		System.out.println("Default");
	}
	Sample(int x){
		this.x=x;
	}
	Sample (int a, int b){
		x=a;
		y=b;
	}
	
	
	
	void calcSum() {
		System.out.println(x+y);
	}
}
