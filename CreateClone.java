package LinkedListExample;

import java.util.LinkedList;

public class CreateClone {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list);
		
		LinkedList<String> list2 = new LinkedList<String>();
		
		list2= (LinkedList<String>)list.clone();
		
		System.out.println(list2);

	}

}
