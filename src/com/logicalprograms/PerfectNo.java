package com.logicalprograms;

import java.util.*;

public class PerfectNo {

	public static void main(String[] args) {
		int sum = 0;
		Scanner pn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = pn.nextInt();

		// executes until the condition becomes false
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i; // calculates the sum of factors
			}
		}
		// checking number is prefect number or not
		if (sum == n) {
			System.out.println(n + " is a perfect number.");
		} else {
			System.out.println(n + " is not a perfect number.");
		}
	}

}
