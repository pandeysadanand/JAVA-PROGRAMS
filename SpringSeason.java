package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date;
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date...");
		date = sc.nextInt();
		System.out.println("Enter Month...");
		month = sc.nextInt();
		if(( month > 3) && (month < 6 ) &&  (date < 31 ) && (date > 1)) {
			System.out.println("True");
		}
		else if((month == 3) && (date > 20) && (date < 31)) {
			System.out.println("True");
		}
		else {
			System.out.println("False! Please Enter date between March 20 and June 20");
		}
	}
}
