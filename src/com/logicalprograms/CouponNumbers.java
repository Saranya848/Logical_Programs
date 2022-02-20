package com.logicalprograms;

import java.util.Scanner;

public class CouponNumbers {

	 public static int getCoupon(int num) {
	        return (int) (Math.random() * num);
	    }
	public static void main(String[] args) {
		Scanner pn = new Scanner(System.in);
		/*
		 * taking user input
		 */
		System.out.print("Enter the number: ");
		int num = pn.nextInt();
	    boolean[] isCollected = new boolean[num];  // isCollected[i] = true if card type i already collected
	    int count = 0;                           // number of cards collected
	    int distinct  = 0;                       // number of distinct card types collected

	    // repeat until you've collected all n card types
	    while (distinct < num) {
	        int value = getCoupon(num);            // pick a random card 
	        count++;                             // one more card
	        if (!isCollected[value]) {           // discovered a new card type
	            distinct++;
	            isCollected[value] = true;
	        }
	    }
	}
}
