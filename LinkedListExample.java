package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListExample {

	public static void main(String[] args) {
		 LinkedList<String> l=new LinkedList<String>();
		 l.add("ram");
		 l.add("sam");
		 l.add("kam");
		 l.add("lam");
		 l.add("bam");
     Iterator<String> i=l.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
	}

}
