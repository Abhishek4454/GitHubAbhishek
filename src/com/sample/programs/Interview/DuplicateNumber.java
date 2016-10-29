package com.sample.programs.Interview;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Singleton s=Singleton.getinstance();
		Singleton s1=Singleton.getinstance();
      /* Scanner sc=new Scanner(System.in);
       sc.nextInt();
       System.out.println("Enter the number :-");*/
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 1; i < 30; i++) {
			al.add(i);
			
		}
		al.add(25);
		System.out.println(al);
		System.out.println("The Duplicate Number is :- " +getDuplicateNumber(al));
		
	}

	private static  Integer getDuplicateNumber(ArrayList<Integer> al) {
		int duplicate;
		int counter = 0;
		int totalSum=0;
		int sum=0;
		for (int i = 0; i < al.size(); i++) {
			totalSum+=al.get(i);
			++counter;
		}
		sum=(counter)*(counter-1)/2;
		duplicate=totalSum-sum;
		return duplicate;
	}

}
