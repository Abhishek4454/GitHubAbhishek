package com.sample.programs.practice;

public class Test {
public static void main(String[] args) {
	Printable p=new B();  
	Call c=new Call();  
	c.invoke(p);
	
	Printable p1=new A();  
	Call c1=new Call();  
	c1.invoke(p1); 
}
}
