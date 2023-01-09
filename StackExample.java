package com.collection.list;

import java.util.Iterator;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> l=new Stack<String>();
		l.push("sravs");
		l.push("ramu");
		l.push("somu");
		l.push("sam");
		l.pop();
		Iterator<String> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());//insertion order
		}

	}

}
