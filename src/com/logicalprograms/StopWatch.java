package com.logicalprograms;

import java.util.*;

public class StopWatch {

	long start = 0, finish = 0, timeelapsed;

	private void initial() {
		/*
		 * Displays the Starting time
		 */
		start = System.currentTimeMillis();
		System.out.println("Start time is   " + start);
	}

	private void end() {
		/*
		 * Displays the Finishing time
		 */
		finish = System.currentTimeMillis();
		System.out.println("Stop time is   " + finish);
	}

	private long getelapsed() {
		/*
		 * Displaying time elapsed
		 */
		timeelapsed = finish - start;
		return timeelapsed;
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value to start watch");//Starting time
		long s = sc.nextLong();
		sw.initial();
		System.out.println("enter value to stop watch");//Stop time
		long sp = sc.nextLong();
		sw.end();
		long e = sw.getelapsed();
		System.out.println("Elapsed time is (milli seconds)  " + e);

	}

}
