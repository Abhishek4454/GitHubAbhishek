package com.sample.programs.threading;

public class Mythread1 extends Thread {
	Table t;

	Mythread1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printtable(5);
		super.run();
	}
}
