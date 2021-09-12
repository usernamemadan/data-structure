package com.algorithms;

public class InsetionSort {

	public static void main(String[] args) {
		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		System.out.println("Before sorting");
	
        for (int i : intArr) {
			System.out.print(i+  "  ");
		}
		
		intInsertionSort(intArr);
		System.out.println("After sorting");
		  for (int i : intArr) {
				System.out.print(i+  "  ");
			}

	}
	
	public static int[] intInsertionSort(int[] arr) {
		int key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
}
