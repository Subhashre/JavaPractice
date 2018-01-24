package main.com.subha.concept.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratorss {

	public static void main(String[] args) {
		Collection<Integer> coll= new ArrayList<>();
		for(int i = 1 ; i<=10 ; i++) {
			coll.add(i);
		}
		Object[] arr =coll.toArray();
		for(Object i : arr) {
			System.out.println(i);
		}
		System.out.println("Iterator starts.................");
		Iterator<Integer> ite =coll.iterator();
		System.out.println("Iterator will hold first elements.."+ite.next());
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("List Iterator starts.................");
		ArrayList<Integer> arrLst = (ArrayList<Integer>) coll;
		ListIterator<Integer> lstIte =arrLst.listIterator();
		System.out.println("List Iterator will hold first elements.."+lstIte.next());
		while(lstIte.hasNext()) {
			System.out.println(lstIte.next());
		}
		System.out.println("List Iterator in reverse directions .................");
		while(lstIte.hasPrevious()) {
			System.out.println(lstIte.previous());
		}
		lstIte.add(100);
		System.out.println(arrLst);
		System.out.println("after adding in the List Iterator .................");
		while(lstIte.hasNext()) {
			System.out.println(lstIte.next());
		}
		System.out.println(arrLst);
/*		An object that implements the Enumeration interface generates a series of elements, one at a time. Successive calls to the nextElement method return successive elements of the series.
				For example, to print all elements of a Vector<E> v:

				   for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
				       System.out.println(e.nextElement());
				Methods are provided to enumerate through the elements of a vector, the keys of a hashtable, and the values in a hashtable. Enumerations are also used to specify the input streams to a SequenceInputStream.

				NOTE: The functionality of this interface is duplicated by the Iterator interface. In addition, Iterator adds an optional remove operation, and has shorter method names. New implementations should consider using Iterator in preference to Enumeration.
				*/
	}

}
