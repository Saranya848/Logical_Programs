package com.logicalprograms;

import java.util.*;

public class MonthlyPayment {
	/*
	 * calculating monthly payments
	 */
	public static double Payment(double p, double r, double t) {
		double M = (p * r) / (1 - Math.pow(1 + r, -t));
		M = Math.round(M * 100) / 100;
		return M;
	}

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.print("Enter Principal Amount : ");// taking user input of amount
		double a = m.nextDouble();
		System.out.print("Enter Rate of Interest : ");// taking user input of Interest
		double r = m.nextDouble();
		r = (r / 100) / 12;
		System.out.print("Enter Time period in years : ");// taking no of year
		double y = m.nextInt();
		y = y * 12;
		double payment = Payment(a, r, y);
		System.out.println("Payment: " + payment);
	}
}
