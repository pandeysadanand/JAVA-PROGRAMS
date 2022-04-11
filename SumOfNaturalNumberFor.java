package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumberFor {

	public static void main(String[] args) {
		int i, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		i=sc.nextInt();
		for(int j = 1; j <= i; j++) {
			sum = sum+j; 
		}
		System.out.println(sum);
	}

}
