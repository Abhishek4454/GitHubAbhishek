package com.sample.programs.threading;

public class Dthread2 extends Thread {
	Dthread1 t1=new Dthread1();
	Dthread1 t2=new Dthread1();
	@Override
public void run() {
	while (true) {
		synchronized (t1) {
			synchronized (t2) {
				System.out.println("Thread t2");

			}
			System.out.println("Thread t1");
		}
		
	}
	}
}
