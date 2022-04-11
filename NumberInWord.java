package com.bridgelabz;

import java.util.Scanner;

public class NumberInWord {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Unit");
		} else if (i == 10) {
			System.out.println("Ten");
		} else if (i == 100) {
			System.out.println("Hundred");
		}
		else {
			System.out.println("Thousand");
		}
	}

}
