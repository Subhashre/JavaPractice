package main.com.subha.concept.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * [abc] - either a , b ,c
 * [^abc] - except a,b c
 * [a-z] -any lower case alphabet symbol
 * [A-Z] - any upper case alphabet symbol
 * [a-zA-Z] -any alphabet symbol
 * [0-9] - Any digit from 0 to 9
 * [a-zA-Z0-9] - any alphanumeric character
 * [^a-zA-Z0-9] - except alphanumeric character
 * \s - space character
 * \S - except space character
 * \d - any numeric character -[0-9]
 * \D - except numeric character -[^0-9]
 * \w - any word character -[a-zA-Z0-9]
 * \W - except word character -[^a-zA-Z0-9] - special character
 *  . - any character
 *  
 *  Quantifiers:
 *  No of occurance of character
 *  a - exactly one a
 *  a+ -atleast one a (group all a together and consider all as a single match)
 *  a* - any no of a including zero number also
 *  a? - atmost one a
 *  
 */
public class RegExDemo2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a2bz2@chy%a");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
		System.out.println("/////////////////");
		p = Pattern.compile("\\s");
		m = p.matcher("a2bz 2@chy%a");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
		System.out.println("Quantifier://///////////////");
		p = Pattern.compile("a+");
		m = p.matcher("a2baaahayaa%aaa");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
		System.out.println("Quantifier continues://///////////////");
		p = Pattern.compile("a*");
		m = p.matcher("a2baaahayaa%aaa");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
		System.out.println("Quantifier continues://///////////////");
		p = Pattern.compile("a?");
		m = p.matcher("a2baaahayaa%aaa");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
		
	}

}

