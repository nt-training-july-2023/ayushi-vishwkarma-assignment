package Collections;


import java.util.*;

public class IntegerList {
public static void main(String []args)
{
	List<Integer> al=new ArrayList<>(20);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 20 elements :");
	for(int i=0;i<20;i++)
	{
		al.add(sc.nextInt());
	}
	Collections.reverse(al);
	System.out.println("Elements of list in reverse order:");
	System.out.println(al);
	
	
	System.out.println("Updated List:");
	for(int i=0;i<al.size();i++)
	{
		if(al.get(i)>50)
		{
			al.set(i, 5);
		}
	}

	System.out.println(al);
	
	System.out.println("Elements less than 60");
	for(int i=0;i<al.size();i++)
	{
		if(al.get(i)<60)
		{
			System.out.println(al.get(i));
		}
	}
}

}
