package com.sample.programs.threading;

public class ThreadPool implements Runnable {
	String message;

	public ThreadPool(String string) {
		this.message = string;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ " (Start) message = " + message);
		processmessage();// call processmessage method that sleeps the thread
							// for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints
																		// thread
																		// name

	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
