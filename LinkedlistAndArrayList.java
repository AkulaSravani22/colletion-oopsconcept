package LinkedListExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistAndArrayList {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("ram");
		linkedlist.add("seeta");
		linkedlist.add("lakyy");
		linkedlist.add("baru");
		System.out.println(linkedlist);
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("arjun");
		arraylist.add("dharma");
		arraylist.add("bheema");
		arraylist.add("karna");
		System.out.println(arraylist);
		linkedlist.addAll(arraylist);
		System.out.println(linkedlist);
		

	}

}
