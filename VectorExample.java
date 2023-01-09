package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample { 

	public static void main(String[] args) {
		Vector<String> l= new Vector<String>();
		l.add("balu");
		l.add("sam");
		l.add("ram");
		l.add("seetha");
		Iterator<String> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
