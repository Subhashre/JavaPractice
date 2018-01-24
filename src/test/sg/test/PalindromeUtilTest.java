package test.sg.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.sg.test.PalindromeUtil;
/**
 * @author subhashree
 * 
 */
@RunWith(JUnit4.class)
public class PalindromeUtilTest {
	
	
	@Test
	public void test_IsPalindrome_Success() {
		assertTrue(PalindromeUtil.isPalindrome("Madam, I'm Adam"));
		assertTrue(PalindromeUtil.isPalindrome("Never odd or even"));
		assertTrue(PalindromeUtil.isPalindrome("1785871"));
	}
	
	@Test
	public void test_IsPalindrome_Failure() {
		assertFalse(PalindromeUtil.isPalindrome("subhashree subudhi"));
		assertFalse(PalindromeUtil.isPalindrome("abc#@$!	,*JHjbbk"));
		assertFalse(PalindromeUtil.isPalindrome(""));
		assertFalse(PalindromeUtil.isPalindrome(",...../&*("));
	}
	
	@Test(expected=NullPointerException.class)
	public void test_IsPalindrome_Null_Failure() {
		PalindromeUtil.isPalindrome(null);
	}

}

