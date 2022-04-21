package com.bridgelabz;

/*
 * This program is for finding second largest element from an array
 * @author: Sadanand Pandey
 */
public class SecondLargest_Array {
	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String args[]) {
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest element :-> " + getSecondLargest(b, 7));
	}
}