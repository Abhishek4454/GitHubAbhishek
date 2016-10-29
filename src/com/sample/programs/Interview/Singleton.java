package com.sample.programs.Interview;

public class Singleton {
	private static Singleton obj;
	static int temp = 0;

	public static Singleton getinstance() {
		
		if (temp == 1) {
			obj = new Singleton();
		}
		return obj;

	}

	private Singleton() {
		System.out.println("Its happening");
		

	}

	public static void main(String[] args) {
		Singleton s = Singleton.getinstance();
		//Singleton s1 = new Singleton();

	}

}
