package main.com.subha.concept.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class SynchronisedMethodExample {

	public static void main(String[] args) {
		SynchronisedMethodExample s = new SynchronisedMethodExample();
		Counter c = s.new Counter();

		Thread a = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Get the value A :" + c.value());
				c.increment();
				System.out.println("Store the value again A:" + c.value());
			}
		});

		Thread b = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Get the value B :" + c.value());
				c.decrement();
				System.out.println("Store the value again B:" + c.value());
			}
		});

		a.start();
		b.start();
		
		
//		Executors.newFixedThreadPool(10)
//		ExecutorService es
//		ForkJoinPool 
	}

	private class Counter {
		private int c = 0;

		public synchronized void increment() {
			c++;
		}

		public synchronized void decrement() {
			c--;
		}

		public synchronized int value() {
			return c;
		}

	}
}
/*Note : A construct cant be synchronized  .
A final value cn be read consistencily without synchronized block 
beacuse the value of final value cnt be chnaged after object is created.*/
