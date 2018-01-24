package main.com.subha.concept.java8.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("subhashree");
		joiner.add("subudhi");
		System.out.println(joiner);

		System.out.println("//////////////");

		joiner = new StringJoiner(" ", "-", "-");
		joiner.add("subhashree");
		joiner.add("subudhi");
		System.out.println(joiner);

		System.out.println("//////////////");

		StringJoiner joiner1 = new StringJoiner(",", "-", "-");
		joiner1.add("Barsha");
		joiner1.add("rani");
		joiner1.merge(joiner);
		System.out.println(joiner1);
	}
}
