package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		year = sc.nextInt();
		if(year >= 1582) {
			if(year % 4 ==0) {
				System.out.println("Given year is leap year");
			}
			else {
				System.out.println("Given year is not leap year");
			}
		}
		else {
			System.out.println("Please enter year greater than 1582.");
		}

	}

}
