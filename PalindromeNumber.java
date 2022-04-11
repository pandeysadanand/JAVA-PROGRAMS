package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num;
		int rev =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		num = sc.nextInt();
		int temp = num;
		for(; temp!=0 ;) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(rev == num) {
			System.out.println("Given number is Plindrome");
		}
		else {
			System.out.println("Given number is not Palindrome");
		}
	}

}
