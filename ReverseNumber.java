package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number; int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		for(; number!=0 ;) {
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number=number/10; 
		}
		System.out.println(reverse);
	}
}
