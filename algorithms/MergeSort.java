package com.algorithms;

import java.util.Scanner;

class MergeSort {

	public static void main(String args[]) {
		System.out.println("Enter number of elemetns");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for(int i=0; i < n ;i++) {
			arr[i] = scanner.nextInt();
		}

		MergeSort merge = new MergeSort();
		merge.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

	void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		/*
		 * Copy data to temp arrays
		 */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/*
		 * Copy remaining elements of L
		 */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/*
		 * Copy remaining elements of R
		 * 
		 */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}