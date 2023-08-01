package Collections;
import java.util.*;
public class HashMapCrud {
public static void main(String []args)
{
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	hm.put(1, 10);
	hm.put(2,20);
	hm.put(3, 20);
	hm.put(4,30);
	
	System.out.println("The original hashmap: "+hm);
	
	hm.put(1, 100);
	System.out.println("HashMap after updating the value at key 1: "+hm);
	
	hm.remove(3);
	System.out.println("HashMap after removing the element at key 3: "+hm);
	
	
   System.out.println("value at index 1 is : "+hm.get(1));
}
}
