package com.bridgelabz.logicalproblem;

import java.util.Scanner;

public class ProgramOfPerfectNumber {
	public static void main(String[] args) {

		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		int i = 1;

		while (i <= num / 2) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == num) {
			System.out.println(" It Is Perfect Number :" + num);
		} else
			System.out.println("It is Not Perfect Number :");

	}
}
