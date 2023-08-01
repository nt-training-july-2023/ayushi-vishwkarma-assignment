package Collections;

import java.util.Map.Entry;
import java.util.*;


public class HashMapExample {
HashMap<Integer,String> hm=new HashMap<Integer,String>();
Scanner sc=new Scanner(System.in);
public void add()
{
	System.out.println("Enter key and value to hashmap:");
	for(int i=0;i<5;i++)
	{
	hm.put(sc.nextInt(), sc.next());
	}
	System.out.println("HashMap: "+hm);
}
public void display(){
	System.out.println("Enter a String to check wheter hashMap contains it or not.");
  String s=sc.next();
  for(Entry<Integer, String> e: hm.entrySet()) {
	  if(e.getValue().contains(s)){
		  System.out.println("Employee Id of "+s+" is: "+e.getKey());
	  }
  }
}
public static void main(String []args)
{
	HashMapExample obj =new HashMapExample();
	obj.add();
	obj.display();
}
}