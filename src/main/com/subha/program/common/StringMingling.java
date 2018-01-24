package main.com.subha.program.common;

public class StringMingling {

	public static void main(String[] args) {
		System.out.println(stringMingling("hacker","ranker") +"\n"+ "hraacnkkeerr".equalsIgnoreCase(stringMingling("hacker","ranker")));
		System.out.println(stringMinglingUsingRecursion("hacker","ranker") +"\n"+ "hraacnkkeerr".equalsIgnoreCase(stringMinglingUsingRecursion("hacker","ranker")));
	}
	
	public static String stringMingling(String s1,String s2) {
		int length = s1.length();
		String s = "";
		for(int i =0 ;i<length ; i++ ) {
//			char[] tempcars = new char[2];
//			tempcars[0]=s1.charAt(i);
//			tempcars[1]=s2.charAt(i);
			char[] tempcars = {s1.charAt(i),s2.charAt(i)};
			String temp = new String(tempcars);
			s += temp;
		}
		return s;
	}
	public static String stringMinglingUsingRecursion(String s1,String s2) {
		int l1 = s1.length();
		if(l1>1) 
			return s1.substring(0, 1) + s2.substring(0, 1) + stringMinglingUsingRecursion(s1.substring(1),s2.substring(1));
		else
			return s1+s2;
	}
}
