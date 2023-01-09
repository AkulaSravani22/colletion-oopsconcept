package LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		Iterator<Integer> itr=list.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}


	}

}
