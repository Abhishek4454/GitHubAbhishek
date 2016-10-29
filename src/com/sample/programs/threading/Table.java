package com.sample.programs.threading;

public class Table {

	void printtable(int i) {
		synchronized (this) {
			for (int n = 1; n < 5; n++) {
				System.out.println(n * i);
			}
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
