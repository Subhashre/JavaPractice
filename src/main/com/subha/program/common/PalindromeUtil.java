package main.com.subha.program.common;

public class PalindromeUtil {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Madam, I'm Adam"));
		System.out.println(isPalindrome("876%$#@&*"));
		System.out.println(isPalindrome("ABAB	A"));
		System.out.println(isPalindrome("876%$#@7&8*"));
	}
	public static boolean isPalindrome(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		if(str.length()==0) 
			return false;
		
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		if(str.equalsIgnoreCase(sb.toString()))
			return true;
		else
			return false;
		
	}
}
