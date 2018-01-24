package main.sg.test;

/**
 * Checks if a string is a palindrome.
 *
 * Palindrome is a word, phrase or sentence that reads the same backward or
 * forward. For example, the following string is a palindrome:
 * "Madam, I'm Adam."
 */
public class PalindromeUtil {
	/**
	 * Checks whether passed String is a palindrome or not.
	 *
	 * Requirements: - Limit the amount of additional consumed memory to O(1). -
	 * Limit complexity to O(n).
	 *
	 * @return true if passed string is palindrome, false - otherwise
	 */
	public static boolean isPalindrome(String str) {
		if (str == null)
			throw new NullPointerException();
		str = str.replaceAll("[^a-zA-Z0-9]", "");

		if (str.length() == 0)
			return false;

		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()) ;

	}
}
