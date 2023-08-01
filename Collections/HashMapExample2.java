package Collections;

import java.util.*;

public class HashMapExample2 {
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	Scanner sc=new Scanner(System.in);
	public void Add()
	{
		hm.put(1,10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.put(5, 50);
		hm.put(6, 60);
		hm.put(7, 70);
		hm.put(8,80);
		hm.put(9,90);
		hm.put(10,100);
	}
	public void display()
	{
		System.out.println("Original HashMap: "+hm);
		System.out.println("Enter Threshold size: ");
		int n=sc.nextInt();
		if(hm.size()>=n)
		{
			hm.clear();
			System.out.println("Hashmap after clearing : "+hm);
		}else {
			System.out.println("HashMap: ");
			System.out.println(hm);
		}
	}
public static void main(String []args)
{
	HashMapExample2 obj =new HashMapExample2();
	obj.Add();
	obj.display();
}
}
