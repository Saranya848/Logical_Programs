package com.logicalprograms;

public class CouponNumbers {

	public static int getCoupon(int num) {
		return (int) (Math.random() * num);
	}

	/*
	 * Before obtaining one of each of the n types, return number of coupons you
	 * picked
	 */
	public static void main(String[] args) {
		// array and random varible to make array coupon code
		char[] coupons = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();

		int max = 100000000;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();

		// logic
		while (random > 0) {
			sb.append(coupons[random % coupons.length]);
			random /= coupons.length;
		}

		// print
		String Code = sb.toString();
		System.out.println("Coupon Code: " + Code);
	}
}
