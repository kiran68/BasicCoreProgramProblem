package com.bridgelabz.logicalproblem;

import java.util.Scanner;

public class ProgramWithFibobacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");

		int num = sc.nextInt();
		int first = 0;
		int second = 1;

		System.out.println("Fibonacci Series " + num + " term");

		for (int i = 2; i <= num; ++i) {
			System.out.println(first + " ");

			int third = first + second;
			first = second;
			second = third;
		}
	}
}
