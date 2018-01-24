package main.com.subha.concept.regularExpression;

import java.util.regex.Pattern;

public class RegExDemo3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		String[] names = p.split("Subhashree Subudhi");
		for (String s : names)
			System.out.println(s);
		System.out.println("//////");
		p = Pattern.compile("a");
		names = p.split("Subhashree Subudhi");
		for (String s : names)
			System.out.println(s);
		System.out.println("//////");
		p = Pattern.compile("."); // won't split anything
		names = p.split("Subhashree Subudhi");
		for (String s : names)
			System.out.println(s);
		System.out.println("//////");
		p = Pattern.compile("\\."); 
		names = p.split("Subhashree.Subudhi1.t-mobile.com");
		for (String s : names)
			System.out.println(s);
		System.out.println("//////");
		p = Pattern.compile("[.]"); 
		names = p.split("Subhashree.Subudhi1.tmobile.com");
		for (String s : names)
			System.out.println(s);
	}

}
