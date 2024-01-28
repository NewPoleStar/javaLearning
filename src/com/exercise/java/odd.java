package com.exercise.java;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int oddNumber=0;
		for(int i=0;i<20;i++) {
			if(oddNumber%2 != 0) {
				System.out.println(i + " is odd number");
			}
			oddNumber++;
		}
		
	}

}
