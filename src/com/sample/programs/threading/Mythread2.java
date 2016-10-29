package com.sample.programs.threading;

public class Mythread2 extends Thread {
	Table t;

	Mythread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printtable(100);
		super.run();
	}
}
