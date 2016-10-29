package com.sample.programs.practice;

public class Sample implements i1,i2 {

	@Override
	public void m1() {
     System.out.println("hdbfskjdh");		
	}
   public static void main(String[] args) {
	Sample s=new Sample();
	s.m1();
	i1 a=new Sample();
	a.m1();
	i2 b=new Sample();
	b.m1();
}
}
