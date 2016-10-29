package com.sample.programs.threading;

public class TestJoin extends Thread {
@Override
public void run() {
	
		try {
			for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			//System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	super.run();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoin t1=new TestJoin();
		TestJoin t2=new TestJoin();
		TestJoin t3=new TestJoin();
		t1.start();
		try {
			t1.join(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();/*
		t1.setName("Abhi");
		t2.setName("Sonu");
		t3.setName("monu");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);*/

	}

}
