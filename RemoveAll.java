package LinkedListExample;

import java.util.LinkedList;

public class RemoveAll {
	public static void main(String[] agrs)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		System.out.println("index of the element  40 is  "+list.indexOf(40));
		list.clear();
		System.out.println(list);
		
	}

}
