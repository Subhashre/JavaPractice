/**
 * 
 */
package test.com.subha.concept.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.com.subha.concept.collection.IteratorFlattener;

/**
 * @author subudhis
 *
 *@
 */
@RunWith(JUnit4.class)
public class IteratorFlattenerTest {

	/**
	 * Test method for {@link com.subha.concept.collection.IteratorFlattener#IteratorFlattener(java.util.Iterator)}.
	 */
	@Test
	public void test_IteratorFlattener() {

	}

	/**
	 * Test method for {@link com.subha.concept.collection.IteratorFlattener#hasNext()}.
	 */
	@Test
	public void test_HasNext_Success() {
		List<String> words1 = Arrays.asList("sup1", "sup2", "sup3");
		words1.iterator();
		List<String> words2 = Arrays.asList("sup4");
		List<String> words3 = Arrays.asList("sup5", "sup6", "sup7");
		List<Iterator<String>> words = Arrays.asList(words1.iterator(), words2.iterator(), words3.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		assertTrue(itrFltStr.hasNext());
	}

	@Test
	public void test_HasNext_Failure() {
		List<String> words1 = Arrays.asList("sup1", "sup2", "sup3");
		words1.iterator();
		List<String> words2 = Arrays.asList("sup4");
		List<String> words3 = Arrays.asList("sup5", "sup6", "sup7");
		List<Iterator<String>> words = Arrays.asList(words1.iterator(), words2.iterator(), words3.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		while(itrFltStr.hasNext())
			itrFltStr.next();
		assertFalse(itrFltStr.hasNext());
	}


	/**
	 * Test method for {@link com.subha.concept.collection.IteratorFlattener#next()}.
	 */

	@Test
	public void test_Next_String_Success() {
		List<String> words1 = Arrays.asList("sup1", "sup2", "sup3");
		words1.iterator();
		List<String> words2 = Arrays.asList("sup4");
		List<String> words3 = Arrays.asList("sup5", "sup6", "sup7");
		List<Iterator<String>> words = Arrays.asList(words1.iterator(), words2.iterator(), words3.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		assertEquals("sup1", itrFltStr.next());
		assertEquals("sup2", itrFltStr.next());
		assertEquals("sup3", itrFltStr.next());
		assertEquals("sup4", itrFltStr.next());
	}

	@Test(expected=NoSuchElementException.class)
	public void test_Next_String_Failure() {
		List<String> words1 = Arrays.asList("sup1", "sup2", "sup3");
		words1.iterator();
		List<Iterator<String>> words = Arrays.asList(words1.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		assertEquals("sup1", itrFltStr.next());
		assertEquals("sup2", itrFltStr.next());
		assertEquals("sup3", itrFltStr.next());
		itrFltStr.next();
	}

	/**
	 * Test method for {@link com.subha.concept.collection.IteratorFlattener#remove()}.
	 */
	@Test
	public void test_Remove_String_Success() {
		Set<String> words1 = new HashSet<String>(Arrays.asList("sup1", "sup2", "sup3"));
		words1.iterator();
		Set<String>  words2 = new HashSet<String>(Arrays.asList("sup4"));
		Set<String> words3 = new HashSet<String>(Arrays.asList("sup5", "sup6", "sup7"));
		List<Iterator<String>> words = Arrays.asList(words1.iterator(), words2.iterator(), words3.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		itrFltStr.next();
		itrFltStr.remove();
		assertTrue(true);
	}

	@Test(expected=IllegalStateException.class)
	public void test_Remove_Twice_String_Failure() {
		Set<String> words1 = new HashSet<String>(Arrays.asList("sup1", "sup2", "sup3"));
		words1.iterator();
		Set<String>  words2 = new HashSet<String>(Arrays.asList("sup4"));
		Set<String> words3 = new HashSet<String>(Arrays.asList("sup5", "sup6", "sup7"));
		List<Iterator<String>> words = Arrays.asList(words1.iterator(), words2.iterator(), words3.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		itrFltStr.next();
		itrFltStr.remove();
		itrFltStr.remove();
	}


	@Test(expected=IllegalStateException.class)
	public void test_Remove_String_Failure() {
		List<String> words1 = Arrays.asList("sup1", "sup2", "sup3");
		words1.iterator();
		List<String> words2 = Arrays.asList("sup4");
		List<String> words3 = Arrays.asList("sup5", "sup6", "sup7");
		List<Iterator<String>> words = Arrays.asList(words1.iterator(), words2.iterator(), words3.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(words.iterator());
		itrFltStr.remove();
	}

}
