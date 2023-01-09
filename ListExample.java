package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;


public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("nani");
		l.add("nari");
		l.add("ramu");
		l.add("somu");
		l.add("sara");
		
		Iterator<String> i=l.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}

	}

}
