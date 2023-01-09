package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();  
		s.add("govind");  
		s.add("Vinod");  
		s.add("nandhu");  
		s.add("Arun");  
		//Traversing elements  
		Iterator<String> itr=s.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}

	}

}
