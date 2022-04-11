package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		int num , rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		num = sc.nextInt();
		System.out.println("The number before reverse : "+ num);
		while(num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println("The reverse number is : " + rev);
	}

}
