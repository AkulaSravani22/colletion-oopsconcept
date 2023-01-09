package LinkedListExample;

import java.util.LinkedList;

public class AddAndDle {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.addFirst(50);
		list.addLast(5);
		
		System.out.println(list);
		
		// removing an element 
		 list.remove();
		System.out.println(list);
		
		// removing an element at Lastindex of the list 
		list.removeLast();
		System.out.println(list);
		
      System.out.println(list.peek());
      
      //Retrieving the elements from the head
      System.out.println(list.peekFirst());
      
      //Retrieving the elements from the tail
      System.out.println(list.peekLast());
      
    //Replacing an element at index 3 with 333
      list.set(3,333);	
      System.out.println(list);
      
       
      list.add(1,333);
      System.out.println(list);
      
      //Only retrieving an element at index 2 of the list
      System.out.println(list.get(2));
      
      //Getting the number of elements in list
      System.out.println( "linkedlist size = "+list.size());
      
      
    //Removing the first occurrence of "333"
      
      list.removeFirstOccurrence(333);

      

      System.out.println(list);      

      //Removing the last occurrence of 

      list.removeLastOccurrence(333);

      System.out.println(list);      
	   
	
	}

}
