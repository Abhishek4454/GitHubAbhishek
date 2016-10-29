package com.sample.programs.threading;

public class RunnableThread {
public static void main(String[] args) throws InterruptedException {
	ImplementRunnable ir=new ImplementRunnable();
	Thread t1=new Thread(ir);
	t1.start();
	t1.sleep(1000);
	Thread t2=new Thread(ir);
	t2.start();
	t2.sleep(1000);
	Thread t3=new Thread(ir);
	t3.start();
	t3.sleep(1000);
	
	
	ExtendsThread ext1=new ExtendsThread();
	ext1.start();
	ext1.sleep(1000);
	
	ExtendsThread ext2=new ExtendsThread();
	ext2.start();
	ext2.sleep(1000);
	
	ExtendsThread ext3=new ExtendsThread();
	ext3.start();
	ext3.sleep(1000);
	
	
	
}
}
