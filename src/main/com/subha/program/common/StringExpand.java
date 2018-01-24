package main.com.subha.program.common;

import java.util.HashMap;

public class StringExpand {

	public static void main(String[] args) {
		String s = "1-5, 8, 11-14, 18, 20, 26-29";
		expand(s);
		
	}

	private static void expand(String s) {
		System.out.println(s);
		String[] arr = s.split(",");
		String result = "";
		for(String ss : arr) {
			String[] nos = ss.split("-");
			if(nos.length > 1 ) {
				for(int i = Integer.valueOf(nos[0].trim()); i<= Integer.valueOf(nos[1].trim()) ; i++)
					result += i +",";
			}
			else
				result += ss.trim()+"," ;
			
			
		}
		
		System.out.println(result.substring(0,result.length()-1));
	}

}
