package com.exercise.java;

import java.util.Arrays;

public class SmallSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tempN;
		int arr[] = { 10, 25, 30, 5, 40, 7, 60 };
		
		
			int aSize = arr.length;
			Arrays.sort(arr);
			// System.out.println(Arrays.toString(arr));
	
		for (int i = 0; i <= aSize; i++) {
			for (int j = i + 1; j < aSize; j++) {
				int currentN = arr[i];
				int nextN = arr[j];
				if (currentN < nextN) {
					tempN = currentN;
					currentN = nextN;
					nextN = tempN;
				}
			}
		}
		System.out.println("Second Smallest Number: " + arr[aSize-(aSize-2)]);
	}
}
