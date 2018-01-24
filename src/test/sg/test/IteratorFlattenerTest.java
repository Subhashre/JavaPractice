package test.sg.test;

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

import main.sg.test.IteratorFlattener;

/**
 * @author subhashree
 * 
 */
@RunWith(JUnit4.class)
public class IteratorFlattenerTest {
	
	@Test(expected=NullPointerException.class)
	public void test_IteratorFlattener_Failure() {
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(null);
	}
	

	@Test
	public void test_HasNext_Success() {
		List<String> wildAnimals = Arrays.asList("tiger", "elephant", "lion");
		List<String> birds = Arrays.asList("parrot", "kingFisher");
		List<String> domAnimals = Arrays.asList("dog", "cat", "goat");
		List<Iterator<String>> animals = Arrays.asList(wildAnimals.iterator(), birds.iterator(), domAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(animals.iterator());
		assertTrue(itrFltStr.hasNext());
		assertTrue(itrFltStr.hasNext());
		assertTrue(itrFltStr.hasNext());
		assertTrue(itrFltStr.hasNext());
		assertTrue(itrFltStr.hasNext());
		assertTrue(itrFltStr.hasNext());
	}

	@Test
	public void test_HasNext_Failure() {
		List<String> wildAnimals = Arrays.asList("tiger", "elephant", "lion");
		List<String> birds = Arrays.asList("parrot", "kingFisher");
		List<String> domAnimals = Arrays.asList("dog", "cat", "goat");
		List<Iterator<String>> animals = Arrays.asList(wildAnimals.iterator(), birds.iterator(), domAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(animals.iterator());
		while (itrFltStr.hasNext())
			itrFltStr.next();
		assertFalse(itrFltStr.hasNext());
	}

	@Test
	public void test_Next_String_Success() {
		List<String> wildAnimals = Arrays.asList("tiger", "elephant", "lion");
		List<String> birds = Arrays.asList("parrot", "kingFisher");
		List<String> domAnimals = Arrays.asList("dog", "cat", "goat");
		List<Iterator<String>> animals = Arrays.asList(wildAnimals.iterator(), birds.iterator(), domAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(animals.iterator());
		assertEquals("tiger", itrFltStr.next());
		assertEquals("elephant", itrFltStr.next());
		assertEquals("lion", itrFltStr.next());
		assertEquals("parrot", itrFltStr.next());
	}

	@Test(expected = NoSuchElementException.class)
	public void test_Next_String_Failure() {
		List<String> wildAnimals = Arrays.asList("tiger", "elephant", "lion");
		List<Iterator<String>> lstWildAnimals = Arrays.asList(wildAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(lstWildAnimals.iterator());
		assertEquals("tiger", itrFltStr.next());
		assertEquals("elephant", itrFltStr.next());
		assertEquals("lion", itrFltStr.next());
		itrFltStr.next();
	}

	@Test
	public void test_Remove_String_Success() {
		Set<String> wildAnimals = new HashSet<String>(Arrays.asList("tiger", "elephant", "lion"));
		Set<String> birds = new HashSet<String>(Arrays.asList("parrot", "kingFisher"));
		Set<String> domAnimals = new HashSet<String>(Arrays.asList("dog", "cat", "goat"));
		List<Iterator<String>> animals = Arrays.asList(wildAnimals.iterator(), birds.iterator(), domAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(animals.iterator());
		itrFltStr.next();
		itrFltStr.remove();
		assertTrue(true);
	}

	@Test(expected = IllegalStateException.class)
	public void test_Remove_Twice_String_Failure() {
		Set<String> wildAnimals = new HashSet<String>(Arrays.asList("tiger", "elephant", "lion"));
		Set<String> birds = new HashSet<String>(Arrays.asList("parrot", "kingFisher"));
		Set<String> domAnimals = new HashSet<String>(Arrays.asList("dog", "cat", "goat"));
		List<Iterator<String>> animals = Arrays.asList(wildAnimals.iterator(), birds.iterator(), domAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(animals.iterator());
		itrFltStr.next();
		itrFltStr.remove();
		itrFltStr.remove();
	}

	@Test(expected = IllegalStateException.class)
	public void test_Remove_String_Failure() {
		List<String> wildAnimals = Arrays.asList("tiger", "elephant", "lion");
		List<Iterator<String>> lstWildAnimals = Arrays.asList(wildAnimals.iterator());
		IteratorFlattener<String> itrFltStr = new IteratorFlattener<String>(lstWildAnimals.iterator());
		itrFltStr.remove();
	}

}
