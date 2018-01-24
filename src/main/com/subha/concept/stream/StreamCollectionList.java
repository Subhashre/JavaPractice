package main.com.subha.concept.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectionList {

	public static void main(String[] args) {
		
		EE e1 = new EE(1,"hbccsb");
		EE e2 = new EE(89,"jknnl");
		EE e3 = new EE(76,"kkjjm");
		EE e4 = new EE(23,"lkmlkmkln");
		EE e5 = new EE(2,"dlkmxsklm");
		EE e6 = new EE(98,"lxkmksklx");
		EE e7 = new EE(1986,"0976782yy87hiunk");
		
		List<EE> eList = new ArrayList<>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.add(e5);
		eList.add(e6);
		eList.add(e7);
		
		System.out.println("Stream Starts  /////////////////////////");
		System.out.println("Stream filter Starts  /////////////////////////");
		eList.stream().filter( e -> e.id >10).forEach(System.out::println);
		
		System.out.println("Stream Map Starts /////////////////////////");
		eList.stream().map(e -> e.id+10).forEach(System.out::println);
		Object[] arr = eList.stream().map(e -> e.id+10).toArray();
		for (Object o: arr)
			System.out.println("item :"+ o);
		
		
		System.out.println("Stream findFirst Starts/////////////////////////");
		System.out.println( eList.stream().findFirst());
		
		System.out.println("Stream allMatch Starts/////////////////////////");
		System.out.println( eList.stream().allMatch(e -> e.id%2==0));
		
		System.out.println("Stream AnyMatch Starts/////////////////////////");
		System.out.println( eList.stream().anyMatch(e -> e.id%2==0));
		
		System.out.println("Stream Collect:List Starts /////////////////////////");
		List<EE> finalList = eList.stream().filter( e -> e.id >10).collect(Collectors.toList());
		System.out.println(finalList);

		System.out.println("Stream Collect:Set Starts /////////////////////////");
		Set<EE> finalSet = eList.stream().filter( e -> e.id >10).collect(Collectors.toSet()); // returns hashset by default
		System.out.println(finalSet);
		
		System.out.println("Stream Collect:Map Starts /////////////////////////");
		Map<Object,Object> finalMap = eList.stream().filter( e -> e.id >10).collect(Collectors.toMap(e -> e.id, f -> f.name)); // returns hashset by default
		System.out.println(finalMap);
		
		System.out.println("Stream Count Starts /////////////////////////");
		System.out.println(eList.stream().filter( e -> e.id >10).count());
		
		System.out.println("Stream distinct Starts/////////////////////////");
		eList.stream().distinct().forEach(System.out::println);
		
		System.out.println("Stream findAny Starts/////////////////////////");
		System.out.println(eList.stream().findAny());
		
		System.out.println("Stream iterator Starts/////////////////////////");
		Iterator<EE> i = eList.stream().filter(e -> e.id <5).iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Stream limit Starts /////////////////////////");
		eList.stream().limit(3).forEach(System.out::println);
		
		System.out.println("Stream max Starts/////////////////////////");
		System.out.println(eList.stream().max((a,b) -> a.id - b.id));
		System.out.println(eList.stream().max((a,b) -> a.name.compareTo(b.name)));
		
		System.out.println("Stream min Starts/////////////////////////");
		System.out.println(eList.stream().min((a,b) -> a.id - b.id));
		System.out.println(eList.stream().max((a,b) -> a.name.compareTo(b.name)));
		
		System.out.println("Stream skip Starts/////////////////////////");
		eList.stream().skip(2).forEach(System.out::println);
		eList.stream().skip(7).forEach(System.out::println); // will return an empty list
		
		System.out.println("Stream sorted Starts/////////////////////////");
		eList.stream().sorted((a,b) -> a.id - b.id).forEach(System.out::println);
		
	}

}

class EE{
	int id;
	String name;
	EE(int id , String name){
		this.id = id ;
		this.name = name;
	}
	@Override
	public String toString() {
		return "EE [id=" + id + ", name=" + name + "]";
	}
	
}
