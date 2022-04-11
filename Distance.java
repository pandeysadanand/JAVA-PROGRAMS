package com.bridgelabz;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x, y;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X : ");
		x = sc.nextInt();
		System.out.println("Enter value of Y : ");
		y = sc.nextInt();
		distance = Math.sqrt((x*x) + (y*y));
		System.out.println("Distance = "+ distance);
	}
}