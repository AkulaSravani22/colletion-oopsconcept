package ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
	   System.out.println(list);
	   list.ensureCapacity(10);//increase the size
	   list.add(10);
	   list.add(70);
	   
	   System.out.println(list);
	   list.trimToSize();
	   //decrease the size
	   System.out.println("size of t he arraylist ="+list.size());
	   
	   System.out.println(list.isEmpty());
	   // to check given ArrayList isEmpty or not
	   System.out.println(list.contains(40));
	   System.out.println(list.contains(90));
	    
	   
	   System.out.println("first occurence of the element= "+list.indexOf(10));
	   
	   System.out.println("first occurence of the element= "+list.lastIndexOf(10));
	   
	   // convert ArrayList in to Array
	  Object[] arr=list.toArray();
	  for(Object obj:arr)
	  {
		  System.out.print(obj+"\t");
	  }
	  
	  // to fetch an element based on index
	  list.get(5);
	  System.out.println("to fetch the element in ArrayList="+ list);
	  
	  //insert an element in to particular index
	  list.set(3, 999);
      System.out.println(list); 
      
      // remove the particular element based on index 
      list.remove(5);
      System.out.println(list);
      
      // remove the all elements
      list.clear();
      System.out.println(list);
      
    
      list.add(111);
      list.add(121);
      list.add(131);
      list.add(141);
      System.out.println(list);
      
      List<Integer> subList = list.subList(2, 4);
      System.out.println(subList); 
      
      list.set(2, 999);
      System.out.println(list);
      
      ArrayList<Integer> list1 =new ArrayList<Integer>();
      list1.add(10);
      list1.add(20);
      list1.add(30);
      list1.add(40);
      
      System.out.println(list1);
      list1.addAll(list);
      System.out.println(list1);
      list1.addAll(3, list);
      System.out.println(list1);
      list.addAll(1,list1);
      System.out.println(list);
      
	}
	

}
