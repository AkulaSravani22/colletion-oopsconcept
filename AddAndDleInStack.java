package LinkedListExample;

import java.util.LinkedList;

public class AddAndDleInStack {

	public static void main(String[] args) {
		LinkedList<String> stack=new  LinkedList<String>();
		
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		stack.push("eee");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		

	}

}
