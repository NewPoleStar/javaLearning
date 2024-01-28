package com.exercise.java;

public class Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,8,85,85};
		int min = arr[0];
		
		for(int i=0;i>arr.length;i++) {
			if (min>arr[i]) {
				min=arr[i];
		
			}
		}
		System.out.println(min);
	}

}
