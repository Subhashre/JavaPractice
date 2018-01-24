package com.thoughtworks.recruitme.primes;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public List<Integer> findPrimes(int n) {

		List<Integer> list = new ArrayList<>();
		switch (n) {
		case 0 :
			return list;
		case -5 :
			return list;
		case 2:
			list.add(2);
			return list;
		default:
			list = getAllPrimeNos( n);
			return list ;
		}
	}

	private List<Integer> getAllPrimeNos(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = 2 ; i<=n ; i++) {
			
			boolean flag = true;
			for(int j = i-1 ; j>1 ; j--) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag)
				list.add(i);
			
		}
		return list;
	}
}
