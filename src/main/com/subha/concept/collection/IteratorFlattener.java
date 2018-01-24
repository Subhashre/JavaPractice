package main.com.subha.concept.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * "Flattens" nested sub-iterators into an iterator in a depth-first manner.
 *
 * Requirements:
 *  - Limit the amount of additional consumed memory to O(1).
 *
 * Example: an iterator {{1,2},{3},{4,5}} which has three sub-iterators with
 * 2, 1 and 2 elements correspondingly, presents values in this order:
 * {1, 2, 3, 4, 5}
 */
public class IteratorFlattener<E> implements Iterator<E> {
	// implement code here ... TODO
	private Iterator<Iterator<E>> rootItr ;
	private Iterator<E> innerItr ;
	private boolean flag = false;
	
	public IteratorFlattener(Iterator<Iterator<E>> root) {
		// implement code here ...TODO
		if(root == null) {
			throw new NullPointerException("Root Iterator is null");
		}else {
			this.rootItr = root ;
			innerItr =null;
		}
	}

	/**
	 * Returns {@code true} if the iteration has more elements.
	 *
	 * @return {@code true} if the iteration has more elements
	 */
	public boolean hasNext() {

		if(innerItr == null) {
			innerItr = rootItr.next();
		}
		while(!innerItr.hasNext() && rootItr.hasNext()) {
			innerItr =rootItr.next();
		}
		return innerItr.hasNext();
	}


	/**
	 * Returns the next element in the iteration.
	 *
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	public E next() {
		if(hasNext()) {
			flag = true;
			return innerItr.next();
		}
		else 
			throw new NoSuchElementException();
	}

	/**
	 * Removes from the underlying collection the last element returned
	 * by this iterator (optional operation). This method can be called
	 * only once per call to {@link #next}.
	 *
	 * @throws IllegalStateException if the {@code next} method has not
	 *         yet been called, or the {@code remove} method has already
	 *         been called after the last call to the {@code next}
	 *         method
	 */
	public void remove() {
		if(!flag) {
			throw new IllegalStateException(); 
		}else {
			innerItr.remove();
			flag = false;
		}
			
	}
	
}
