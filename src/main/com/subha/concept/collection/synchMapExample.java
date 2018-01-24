package main.com.subha.concept.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class synchMapExample {
	
	public static void main(String[] args) {
		
		Map<String, String> map = Collections.synchronizedMap(new HashMap<String,String>(10));
		map.put("A","aaaa");
		Iterator<String> i = map.keySet().iterator();
		synchronized ( i) {
			while(i.hasNext())
				System.out.println(i.next());	
		}
		
		
		Map map1 = Collections.synchronizedMap(new HashMap());
		//This doesn't need to be in synchronized block
		Set set = map.keySet();
		// Synchronizing on map, not on set
		synchronized (map1) {  
		      // Iterator must be in synchronized block
		      Iterator iterator = set.iterator(); 
		      while (iterator.hasNext()){
		    	  System.out.println(iterator.next());	
		      }
		}
		
	}
	
	

}
