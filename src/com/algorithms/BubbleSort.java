package com.algorithms;

public class BubbleSort {
	public static void main(String[] args) {
		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		System.out.println("Before sorting");
	
        for (int i : intArr) {
			System.out.print(i+  "  ");
		}
		
		BubbleSort(intArr);
		System.out.println("\nAfter sorting");
		  for (int i : intArr) {
				System.out.print(i+  "  ");
			}

	}
	
	public static int[] BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;

	}

}
