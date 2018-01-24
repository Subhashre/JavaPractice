package main.com.subha.concept.collection;

import java.util.LinkedList;

public class LinkedListAsStack {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		System.out.println("Pushing the data ");
		list.addFirst("Abc");
		list.addFirst("ikhkn");
		list.addFirst("dfaj");
		list.addFirst("losjnsl");
		System.out.println("Poping the data ");
		while(!list.isEmpty())
			System.out.println(list.pollFirst());
	
		System.out.println("Pushing the data ");
		list.push("jkfnakjfnak");
		list.push("ksdksdkjsnd");
		list.push("otrjms");
		list.push("ytsbrew");
		list.push("aurnmg");
		System.out.println("Poping the data ");
		while(!list.isEmpty())
			System.out.println(list.pop());
	}

}
