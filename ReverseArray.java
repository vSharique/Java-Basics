package com.sharique.programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,4,6,99,5,7,8,30};
		System.out.println("Array Before Reserver: " + Arrays.toString(arr));
		reverse(arr);
		System.out.println("Array After Reserver: " + Arrays.toString(arr));

	}
	
	private static int[] reverse(int[] arr) {
		int maxIndex = arr.length - 1;
		int halfArray = arr.length / 2;
		for(int i=0; i<halfArray; i++) {
			int temp = arr[i];
			arr[i] = arr[maxIndex - i];
			arr[maxIndex - i] = temp;
		}
		return arr;
	}

}
