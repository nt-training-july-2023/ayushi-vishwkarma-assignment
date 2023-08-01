package Collections;

import java.util.*;
public class LinkedHashMapExample {
public static void main(String []args)
{
	LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
	lm.put(1, 10);
	lm.put(2,20);
	lm.put(3, 30);
	lm.put(4, 40);
	System.out.println("Original LinkedHashMap: "+lm);
	lm.put(4, 400);
	System.out.println("LinkedHashMap after updation: "+lm);
	lm.remove(2);
	System.out.println("LinkedHashMap after removing the element at key 2: "+lm);
	System.out.println("Value at key 4: "+lm.get(4));
}
}
