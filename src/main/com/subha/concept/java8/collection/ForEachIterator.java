package main.com.subha.concept.java8.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachIterator {

	public static void main(String[] args) {

		List<Integer> list= new ArrayList<>();
		for(int i=0;i<10;i++) list.add(i);
		System.out.println("Traditional way to traverse a collectio-------------------------------");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("java 8 features to traverse a collectio-------------------------------");
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		System.out.println("using inheritance,,,,,,,,,,,,,,,");
		MyConsumer mc = new MyConsumer();
		list.forEach(mc);
		
		System.out.println("using method referencing......................");
		list.forEach( new MyConsumer()::accept);
		
		System.out.println("using lambda expressions.................");
		list.forEach( x -> System.out.println(x));
	}

	
}
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		 System.out.println(t);
		
	}
	
}