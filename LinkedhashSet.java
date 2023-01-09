package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("ram");
		set.add("shyam");
		set.add("govind");
		Iterator<String> itr =set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
