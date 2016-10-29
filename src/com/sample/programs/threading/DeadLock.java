package com.sample.programs.threading;

public class DeadLock  {

	public static void main(String[] args) {
		Dthread1 t1=new Dthread1();
		Dthread1 t2=new Dthread1();
		t1.start();
		t2.start();

	}

}
