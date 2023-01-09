package HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapFromKey {

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
    	
    	int value = map.get("ccc");
    	System.out.println(value);  
        
     }

}
