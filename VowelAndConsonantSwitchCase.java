package com.bridgelabz;

import java.util.Scanner;

public class VowelAndConsonantSwitchCase{

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter..");
		ch = sc.next().charAt(0);
		switch(ch) {
		case 'a','A':
		case 'e','E':
		case 'i','I':
		case 'o','O':
		case 'u','U':System.out.println("Vowel");
		break;
		default: System.out.println("Consonant");
		}
	}
}
