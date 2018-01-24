package main.com.subha.concept.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Find the no of occurance and index of occurance
 * 
 * in a string
 * 
 * m.end() returns endIndex + 1
 * m.group() returns the searching pattern
 * 
 * Pattern:
 * compiled version of regular expression
 * Equivalant java object of regular expression
 * can be created usinf compile method of Pattern Class(static method)
 * 
 * Matcher:
 * to match the given pattern in the target string
 * can be created using matcher method of pattern class(non-static method)
 *  * 
 * */
public class RegExDemo1 {

	public static void main(String[] args) {
		int count =0;
		Pattern pattern = Pattern.compile("ab");
		Matcher m = pattern.matcher("ababbab");
		while(m.find()) {
			System.out.println(m.start() +"..." + m.end()+"..."+ m.group());
			count++;
		}
		System.out.println("The no of occurance is :"+count);
		String target = "ababbab";
		
	}

}
