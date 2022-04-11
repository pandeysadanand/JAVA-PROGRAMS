package com.bridgelabz;

import java.util.*;
/*
 * This is for comparing two string , is it equal or not
 * @ author : Sadanand Pandey
 */
public class EqualString {

	public static void main(String[] args) {							
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1 : ");
		s1 = sc.nextLine();
		System.out.println("Enter s2 : ");
		s2 = sc.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("Two strings are equal");
		}
		else
			System.out.println("Two string are not equal");
	}
}	