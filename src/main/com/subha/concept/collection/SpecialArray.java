package main.com.subha.concept.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class SpecialArray {

	public static void main(String[] args) {
		int[] numbers = {1, 4, 3 ,2 ,6};
		List<Integer> primeNos = new ArrayList<>();
		List<Integer> nonPrimeNos = new ArrayList<>();
		for(int n : numbers)
			if(n==1)
				nonPrimeNos.add(n);
			else if (isPrime(n))
				primeNos.add(n);
			else 
				nonPrimeNos.add(n);
		Collections.sort(primeNos);
		Collections.sort(nonPrimeNos, (a,b) -> (a>b)? -1 : 1);
		List result = Arrays.asList(primeNos,nonPrimeNos);
		System.out.println(result);
		nonPrimeNos.clear();
		primeNos.clear();
		for(int n : numbers)
		if(n==1)
			nonPrimeNos.add(n);
		else if (isPrimeRecursion(n,2))
			primeNos.add(n);
		else 
			nonPrimeNos.add(n);
		result = Arrays.asList(primeNos,nonPrimeNos);
		System.out.println(result);
		
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "abc");
		ht.put(2, "abc1");
		HashMap<Integer,String> map =new HashMap<>(ht);
		Iterator<Integer> i=map.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(map.get(i.next()));
		}
		
	}

	public static boolean isPrime(int no){
		boolean flag = true ;
		for(int i = 2; i< no ; i++) {
			if( no% i == 0) {
				flag = false;
				break;
			}
		}
		return flag ;		
	}
	
	public static boolean isPrimeRecursion(int no,int no1){
		
		if(no > no1)
		{
			if(no % no1 != 0)
				return isPrimeRecursion(no, ++no1);
		}
		else
			return true ;
		return false ;
	}

}
