package com.sample.programs.Interview;

import java.security.acl.LastOwnerException;
import java.util.Scanner;

public class ReverseString {
	
	static String s="";
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ReverseString rs=new ReverseString();
	System.out.println("Enter the String :-");
    String reverse=rs.getReverseString(sc.next());
    System.out.println("Reverse of the given String is " +reverse);
}

private  String getReverseString(String reverse) {
	if (reverse.length()<2) {
		return reverse;
	}
	else {
		s=reverse.charAt(reverse.length()-1)+ getReverseString(reverse.substring(0, reverse.length()-1));
		return s;
	}
	
}
}
