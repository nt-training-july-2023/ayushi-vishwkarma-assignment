package Collections;


import java.util.*;

public class RemoveMethodInMap {
public static void main(String[]args)
{   
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	Scanner sc=new Scanner(System.in);
	hm.put(1,"Ayushi");
	hm.put(2, "Arpita");
	hm.put(3, "Jiya");
	hm.put(4, "Kartik");
	hm.put(5, "Krishna");
	System.out.println("Original Hashmap : "+hm);
	System.out.println("Enter the value you want to remove from map: ");
	String value=sc.next();
	int key=0;
	for(Map.Entry<Integer, String> entry:hm.entrySet())
	{
		
		if(hm.containsValue(value))
		{
			key=entry.getKey();
			break;
		}
	}
	hm.remove(key);
	System.out.println("After removing the key value pair: "+hm);
	
}

}
