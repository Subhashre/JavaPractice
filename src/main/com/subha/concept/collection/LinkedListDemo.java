package main.com.subha.concept.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListDemo {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		Iterator<Integer > i = list.iterator();
		while(i.hasNext()) {
			int i1 = i.next();
			System.out.println(i1);
			if(i1 == 10)
//				list.remove(); // Exception in thread "main" 10 java.util.ConcurrentModificationException
				i.remove();
			
		}
		System.out.println(list);
		
		
		TreeSet set = new TreeSet<>();
		set.add(10);
//		set.add(null); 
		set.add(98);
		set.add(30);
		set.add(40);
		
		System.out.println(set);
		
		System.out.println(set.higher(31));
		
		HashMap h = new LinkedHashMap<>();
		h.put(111,"ratan");
		h.put(222,"anu");
		h.put(333,"sravya");
		System.out.println(h);
		
		Set set1 = h.entrySet();
		Iterator ii =set1.iterator();
		while(ii.hasNext()) {
			Entry entry = (Entry)ii.next();
			System.out.println(entry.getKey()+"-->" + entry.getValue());
			
		}
		List list1 = new ArrayList(set1);
		Collections.sort(list1 , new Comparator<Entry>() {

			@Override
			public int compare(Entry o1, Entry o2) {
				String s1 = (String)o1.getValue() ;
				String s2 = (String)o1.getValue() ;
				return s1.compareTo(s2);
			}
			
		});
		System.out.println(list1);
	}

}
