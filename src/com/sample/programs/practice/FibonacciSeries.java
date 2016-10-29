package com.sample.programs.practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number whose fibonnaci has to be found :-");
		int febcount = s.nextInt();
		int fib[] = new int[febcount];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int i = 0; i < fib.length; i++) {
			System.out.println("\t"+fib[i]);

		}
	}

}
