package HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashEx {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
    	map.put("aaa", 1);
    	map.put("bbb", 2);
    	map.put("ccc", 3);
    	map.put("ddd", 4);
    	System.out.println(map);
    	
    	
    	
    	Set<Entry<String,Integer>> entrySet=map.entrySet();
    	
    	for(Entry<String,Integer> set:entrySet)
    	{
    		System.out.println(set.getKey()+":"+set.getValue());
         
    	}
    	System.out.println(map.putIfAbsent("ddd",4));
    	System.out.println(map.putIfAbsent("eee",5));
    	
    	 
    	System.out.println(map.containsKey("aaa"));      //Output : true
         
         //Checking whether value '3.3' exist in map
          
         System.out.println(map.containsValue(4));  
       
         
         //Retrieving the number of key-value pairs present in map
          
         System.out.println("size of map :"+map.size());
         
         map.clear();
         
         //Checking the number of key-value pairs after clearing the map
          
         System.out.println("size of map :"+map.size());  
	}

}
