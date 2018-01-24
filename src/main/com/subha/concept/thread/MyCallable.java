package main.com.subha.concept.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Callable<String> callable = new MyCallable(); 
		List<Future<String>> results= new ArrayList<>();
		for(int i=0 ; i<100 ; i++) {
			Future<String> future = executorService.submit(callable);
			results.add(future);
		}
		for(Future<String> f : results) {
			System.out.println(System.currentTimeMillis() + " : "+ f.get());
		}
		
		
	}

	@Override
	public String call() {
		try {
			Thread.sleep(1000);
			return Thread.currentThread().getName();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
