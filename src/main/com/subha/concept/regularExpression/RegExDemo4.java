package main.com.subha.concept.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Req-1:
 * 1. 10 digit mobile numbers
 * 2. First digit should be 7,8 or 9
 * ans:
 * [7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
 * [7-9][0-9]{9}
 * [789][0-9]{9}
 * 
 * Req-2:
 * 1. 10 or 11 digit no
 * 2. if 11 digit then 1st digit is zero
 * ans:
 * 0?[7-9[[0-9]{9}
 * 
 * Req-2:
 * 1. 10 or 11 or 12 digit no
 * 2. if 12 digit then 1st 2 digit should be 91
 * ans:
 * (0|91)?[7-8][0-9]{9}
 * 
 * Req-3:
 * 1. name [a-zA-Z0-9]-_.
 * 2. domain [0-9a-zA-Z]
 * ans;
 * [a-zA-Z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
 * only gmail ids
 * [a-zA-Z0-9][a-zA-z0-9_.]*@gmail[.]com
 * 
 * Req-4:
 * 1. Allowed Character are : a-zA-Z0-9#$
 * 2. the length od identifier is atleast 2
 * the first character should be lowercase bet a to k
 * the second char should be a digit divisble by 3
 * ans:[a-k][0369][a-zA-Z0-9#$]*
 * 
 * Req-5:names starts with a
 * ans:[Aa][a-zA-Z]*
 * 
 * Req-6: names ends with lL
 * ans:[a-zA-Z]*[lL]
 * 
 * Req-7: names starts with a and ends with l
 * ans:[aA][a-zA-Z]*[lL]
 * 
 * 
 */
public class RegExDemo4 {

	public static void main(String[] args) {
		System.out.println("Check for valid mobile nos");
		Pattern p = Pattern.compile("(0|91)?[7-8][0-9]{9}");
		Matcher m = p.matcher("917893949596");
		if(m.find())
			System.out.println("Mobile no matched...");
		else
			System.out.println("Mobile no does not matched...");
		
		System.out.println("Check for valid emailds");
		p = Pattern.compile("[a-zA-Z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		m = p.matcher("bsubudhi650@gmail.com");
		if(m.find())
			System.out.println("email id matched...");
		else
			System.out.println("email id does not matched...");
	}

}
