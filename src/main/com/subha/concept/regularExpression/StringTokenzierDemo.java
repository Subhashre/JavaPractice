package main.com.subha.concept.regularExpression;

import java.util.StringTokenizer;

/*
 * StringTokenizer is desined for tokenization activity
 * available in java.util package
 * default pattern is space 
 * 
 */
public class StringTokenzierDemo {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Subhashree Subudhi");
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());
		System.out.println("///////////////");
		tokenizer = new StringTokenizer("04-01-2018","-");
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());
	}

}
