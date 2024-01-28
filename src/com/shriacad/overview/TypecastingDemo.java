package com.shriacad.overview;

public class TypecastingDemo {

	public static void main(String[] args) {

//		int x = 10;
//		int y = 20;
//		long a = x + y;
//		System.out.println(a);
//		// downcasting
//		int p = (int) a;
//
//		float v = 12.4f;
//		float v1 = (float) 12.4;
//		System.out.println("Concat " + p + v + v1); // concat
//		System.out.println("Sum " +(p + v + v1)); // addition
//	
//		int a1=20,b=45,c =45;
//		if(a<b && a<c) {
//			System.out.println("A is greater");
//		}else if(b<c){
//			System.out.println("B is greater");
//		}else {
//			System.out.println("C is greater");
//			
//		}
		
		
		int f=23; 
		int g=(f<50)?70:f+1;
		System.out.println(g);
	
		int h=23;
		int y=34;
		int u=24;
		String result = (h>y)?"H is greater":"Y is greater";
		System.out.println("result 1" +result);
		
		String result2 = (h>y) && (h>u)?"H is greater":(y>u)? "Y is greater":"u is greaerst";
			System.out.println("result2 "+result2);
	}
}