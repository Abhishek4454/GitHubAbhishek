package com.sample.programs.practice;

import java.util.Scanner;

public class FactorialRecursion {
	int result=1;
	public  static int factorial(int n) {
		if (n==0) {
			return 1;
			
		}else {
			return n*factorial(n-1);
		}
		
       
	}
	
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number whose factorial has to be found:-" );
	int n = scanner.nextInt() ;
	int result=factorial(n);
    System.out.println("The factorial of " + n + " is " + result);

}

}
