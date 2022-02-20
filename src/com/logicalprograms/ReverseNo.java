package com.logicalprograms;

import java.util.Scanner;

public class ReverseNo {
	public static void reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int remainder = n % 10;
			rev = rev * 10 + remainder;
			n = n / 10;
		}
		System.out.print("The reverse of the number: " + rev);
	}

	public static void main(String[] args) {
		Scanner rn = new Scanner(System.in);
		/*
		 * taking user input
		 */
		System.out.print("Enter the number: ");
		int n = rn.nextInt();

		reverse(n);

	}

}
