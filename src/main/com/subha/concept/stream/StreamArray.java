package main.com.subha.concept.stream;

import java.util.stream.Stream;

public class StreamArray {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		String[] arr = { "12", "54", "1", "34", "87" };
		// arr.stream(); //compilation error

		Stream<String> stream = Stream.of(arr);
		stream.forEach(System.out::println);

		
	}
}