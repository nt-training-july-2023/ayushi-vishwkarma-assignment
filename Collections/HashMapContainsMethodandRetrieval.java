package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapContainsMethodandRetrieval {
public static void main(String[]args)
{
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"Ayushi");
	hm.put(2, "Arpita");
	hm.put(3, "Jiya");
	hm.put(4, "Kartik");
	hm.put(5, "Krishna");
	
	
    if(hm.containsValue("Krishna"))
    {
    	System.out.println("HashMap contains value Krishna.");
    }
    if(hm.containsKey(1))
    {
    	System.out.println("HashMap contains key 1 whose value is: "+hm.get(1));
    }
    
    
    //retrieving key and value seprately
    for(Entry<Integer, String> e: hm.entrySet()) {
    	System.out.println("Key: "+e.getKey());
    	System.out.println("Value: "+e.getValue());
    }
    
}
}
