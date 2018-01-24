package main.com.subha.program.common;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class StringEqual {

	public static void main(String[] args) {

		String s1 = "test";
		String s2 = new String("test");
		String s3 = "test";
		String s4 = new String("test");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println("//////////");
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		System.out.println("//////////");
		System.out.println(s2.equals(s4));
		System.out.println(s2==s4);
		
		
		
	}

}
