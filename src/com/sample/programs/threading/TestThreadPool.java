package com.sample.programs.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		 ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
	        for (int i = 0; i < 10; i++) {  
	            Runnable worker = new ThreadPool("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	}

}
