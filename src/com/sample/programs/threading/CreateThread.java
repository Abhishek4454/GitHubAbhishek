package com.sample.programs.threading;

public class CreateThread implements Runnable {
@Override
public void run() {
System.out.println("Thread started.......");

}
	
	
	public static void main(String[] args) {
		CreateThread m1=new CreateThread();
		Thread t1=new Thread(m1);
		t1.start();
		//t1.start(); java.lang.IllegalThreadStateException

	}
}
