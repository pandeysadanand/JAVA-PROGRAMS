package com.bridgelabz;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		double r1, r2, r3 , r4;
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		a = sc.nextInt();
		System.out.println("Enter value of b : ");
		b = sc.nextInt();
		System.out.println("Enter value of c : ");
		c = sc.nextInt();
		r1 = (a + (b * c));
		System.out.println(r1);
		r2 = (c + (a / b));
		System.out.println(r2);
		r3 = ((a % b) + c);
		System.out.println(r3);
		r4 = ((a * b) +c);
		System.out.println(r4);
		if((r1 > r2) && (r1 > r3) && (r1 > r4)) {
			System.out.println("R1 is maximum.");
		}
		else if((r2 > r1) && (r2 > r3) && (r2 > r4)) {
			System.out.println("R2 is maximum.");
		}
		else if((r3 > r1) && (r3 > r2) && (r3 > r4)) {
			System.out.println("R3 is maximim. ");
		}
		else {
			System.out.println("R4 is maximim.");
		}
	}
}
