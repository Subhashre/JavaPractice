package main.com.subha.program.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindUniqueElement {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(7);
		
		System.out.println(list);
		
		HashSet set = new HashSet<>(list);
		System.out.println(set);
		
	}

}
