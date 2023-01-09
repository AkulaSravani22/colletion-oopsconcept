package LinkedListExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddAndDleInQueue {

	public static void main(String[] args) {
	
		LinkedList<String> queue=new LinkedList<String>();
		queue.offer("aaa");
		queue.offer("abc");
		queue.offer("bbb");
		queue.offer("bcd");
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.pollLast();
		System.out.println(queue);
		queue.offerFirst("ddd");
		System.out.println(queue);
		queue.offerLast("eee");
		System.out.println(queue);
		
		
	}

}
