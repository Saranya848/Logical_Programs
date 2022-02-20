package com.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void getprime(int num) {
		boolean flag = false;

		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		/*
		 * checking number is prime or not
		 */
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

	public static void main(String[] args) {
		Scanner pn = new Scanner(System.in);
		/*
		 * taking user input
		 */
		System.out.print("Enter the number: ");
		int num = pn.nextInt();

		getprime(num);

	}

}
