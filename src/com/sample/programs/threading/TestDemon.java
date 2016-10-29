package com.sample.programs.threading;

public class TestDemon extends Thread {
@Override
public void run() {
	if (Thread.currentThread().isDaemon()) {
		System.out.println("Demon Thread works");
		System.out.println(Thread.currentThread().getName());
	}
	else {
		System.out.println("User Thread stopped");

	};
	super.run();
}
	
	public static void main(String[] args) {
		TestDemon t1=new TestDemon();
		TestDemon t2=new TestDemon();
		TestDemon t3=new TestDemon();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}
}
