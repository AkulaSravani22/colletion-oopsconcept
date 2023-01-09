package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<>();
		t.add("ram");
		t.add("shyam");
		t.add("mango");
		t.add("kira");
		Iterator<String> itr= t.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		

	}

}
