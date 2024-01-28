package com.exercise.java;

public class SumAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int aSize = arr.length;
		
		int sum = 0;
		for (int i = 0; i < aSize; i++) {
			for (int j = 1; j < aSize; j++) {
				sum = sum + arr[i];
			}
	
		}
		System.out.println("Sum :" + sum);
		
		int ave = 0;
		for(int i=0; i<aSize;i++) {
			for(int j=1;j<aSize;j++) {
				sum = sum + arr[i];
				ave = sum/aSize;
			}
		}
		System.out.println("Ave: " + ave);
	}
}
