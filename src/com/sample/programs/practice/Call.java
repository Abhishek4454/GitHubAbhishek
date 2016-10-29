package com.sample.programs.practice;

public class Call {
	void invoke(Printable p) {// upcasting
		if (p instanceof A) {
			A a = (A) p;// Downcasting
			a.A();
		}
		if(p instanceof B){  
			B b=(B)p;//Downcasting   
			b.B();  
			}  
	}
}
