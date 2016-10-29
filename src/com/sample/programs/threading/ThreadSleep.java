package com.sample.programs.threading;

public class ThreadSleep extends Thread {
@Override
public void run() {
	try {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			System.out.println("\n "+i);
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());;
	}
	
	super.run();
}
	
	public static void main(String[] args) {
		ThreadSleep t1=new ThreadSleep();
		ThreadSleep t2=new ThreadSleep();
		//t1.start();
		//t2.start();
		t1.run();
		t2.run();
	}

}
