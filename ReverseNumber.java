package com.bridgelabz.logicalproblem;

public class ReverseNumber {
	public static void main(String[] args) {

		int num = 456789, reverse = 0;

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
		}
		System.out.println("Reversed Number:" + reverse);
	}
}
