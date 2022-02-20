package com.logicalprograms;

import java.util.*;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		Scanner fs = new Scanner(System.in);
		System.out.println("Enter number");
		int n = fs.nextInt();
		System.out.println("Fibbonacci Series are:-");
		System.out.print(a + " " + b);// printing 0 and 1
		/*
		 * //looping upto user input number
		 */
		for (int i = 2; i < n; ++i) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}
