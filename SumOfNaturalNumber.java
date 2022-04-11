package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int i, n=0;
		int sum =0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a natural number");
		i = sc.nextInt();
		
		while(n <= i) {
			sum = sum +n;
			n++;
		}
		System.out.println(sum);
	}
}
