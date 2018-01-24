package main.com.subha.program.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableImpl implements Comparable<ComparableImpl>{
	
	int id;
	String Name;
	
	public ComparableImpl(int id, String name) {
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "ComparableImpl [id=" + id + ", Name=" + Name + "]";
	}

	public static void main(String[] args) {
		
		ComparableImpl o1 = new ComparableImpl(19,"abc");
		ComparableImpl o2 = new ComparableImpl(20,"jhbjhb");
		ComparableImpl o3 = new ComparableImpl(9,"skjvns");
		ComparableImpl o4 = new ComparableImpl(56,"klmlkm");
		
		List<ComparableImpl> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		for (ComparableImpl c: list)
			System.out.println(c);
		System.out.println("///////////////");
		Collections.sort(list,( a,b) -> a.Name.compareTo(b.Name) );
		
		for (ComparableImpl c: list)
			System.out.println(c);
	}

	@Override
	public int compareTo(ComparableImpl o) {
		return this.id - o.id;
		 
	}

}
