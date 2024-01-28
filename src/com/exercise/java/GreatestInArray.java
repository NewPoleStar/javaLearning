package com.exercise.java;

import java.util.Arrays;

public class GreatestInArray {

	static int myArray[] = { 10, 30, 20 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an array
		int arr[] = { 10, 50, 25, 35 };
		Arrays.sort(arr);
		int max = arr[0];
		// read array.

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(i);
			// read the array and print
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max value in an array is: " + max);
	}
}
