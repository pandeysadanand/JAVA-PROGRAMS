package com.bridgelabz;

import java.util.Scanner;

public class Root {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A");
		a = sc.nextInt();
		System.out.println("Enter value of B");
		b = sc.nextInt();
		System.out.println("Enter value of C");
		c = sc.nextInt();
		int delta =((b*b) - (4 * a * c));
		System.out.println("Delta = " + delta);
		double rt = Math.sqrt(delta);
		int root1 = (int) ((-b + rt)/(2*a));
		System.out.println("root1 = " +root1);
		int root2 = (int) ((-b - rt)/(2*a));
		System.out.println("root2 = " +root2);
	}
}
