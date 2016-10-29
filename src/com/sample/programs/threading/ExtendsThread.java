package com.sample.programs.threading;

public class ExtendsThread extends Thread {
	int counter = 0;

	@Override
	public void run() {
		System.out.println("Countenr for ExtendsThread:- " + counter++);
		super.run();
	}
}
