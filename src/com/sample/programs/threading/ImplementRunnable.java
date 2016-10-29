package com.sample.programs.threading;

public class ImplementRunnable implements Runnable {
	int counter = 0;

	@Override
	public void run() {
	
    System.out.println("Countenr for ImplementRunnable:- " + counter++);
	}

}
