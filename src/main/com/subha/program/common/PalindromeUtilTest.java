package main.com.subha.program.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeUtilTest {

	
	@Test
	public void test_IsPalindrome_Success() {
		boolean result = PalindromeUtil.isPalindrome("Madam, I'm Adam");
		assertTrue(result);
	}

	@Test
	public void test_IsPalindrome_Success1() {
		boolean result = PalindromeUtil.isPalindrome("Never odd or even");
		assertTrue(result);
	}
	
	@Test
	public void test_IsPalindrome_Success2() {
		boolean result = PalindromeUtil.isPalindrome("1785871");
		assertTrue(result);
	}

	@Test
	public void test_IsPalindrome_Failure() {
		boolean result = PalindromeUtil.isPalindrome("subhashree subudhi");
		assertFalse(result);
	}

	@Test
	public void test_IsPalindrome_Failure1() {
		boolean result = PalindromeUtil.isPalindrome("abc#@$!	,*JHjbbk");
		assertFalse(result);
	}

}
