package com.bridgelabz;

/*
 *  This program is printing an array in reverse order
 *  @author : Sadanand Pandey
 */
public class ReverseOrder_Array {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original array: ");
		System.out.println("--------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------------");

		System.out.println();
		System.out.println("Array in reverse order: ");
		System.out.println("--------------------------");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------------");

	}
}