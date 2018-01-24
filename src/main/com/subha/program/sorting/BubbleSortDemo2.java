package main.com.subha.program.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BubbleSortDemo2 {

	public static void main(String[] args) {
		int temp = 2;
		Set<contestent> set = new TreeSet<>(new myComparator());
		set.add(new contestent("surbhi", 3));
		set.add(new contestent("surpanakha", 3));
		set.add(new contestent("shreya", 5));
		System.out.println(set);
		ArrayList list = new ArrayList(set);
		for(int i = 0 ; i<temp ; i++) {
			System.out.println((contestent)list.get(i));
		}
	}

}

class contestent{
	String name;
	int fanCount;
	public contestent(String n,int c) {
		name = n;
		fanCount = c ;
	}
	@Override
	public String toString() {
		return name;
	}
}
class myComparator implements Comparator<contestent>{

	@Override
	public int compare(contestent o1, contestent o2) {
		
		if(o1.fanCount == o2.fanCount)
			return o1.name.compareTo(o2.name);
		return o2.fanCount - o1.fanCount;
	}
	
}