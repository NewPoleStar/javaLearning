package com.exercise.java;

import java.util.Arrays;

public class largeSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tempN;
		int arr[] = { 200, 425, 304, 345, 490, 592, 954 };
		int aSize = arr.length;
		Arrays.sort(arr);

		for (int i = 0; i <= aSize; i++) {
			for (int j = i + 1; j < aSize; j++) {
				int currentN = arr[i];
				int nextN = arr[j];
				if (currentN > nextN) {
					tempN = currentN;
					currentN = nextN;
					nextN = tempN;

				}
			}
		}
		System.out.println("Second Largest Number: " + arr[aSize - 2]);
	}
}
