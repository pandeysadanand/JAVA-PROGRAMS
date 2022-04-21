package com.bridgelabz;

/*
 *  This program is printing elements of an array
 *  @author : Sadanand Pandey
 */
public class ElementOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("Given element of array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
