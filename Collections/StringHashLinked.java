package Collections;
import java.util.*;
public class StringHashLinked {
public static void main(String []args)
{
	LinkedHashSet<String> hs=new LinkedHashSet<>();
	LinkedHashSet<String> hs1=new LinkedHashSet<>();
	hs1.add("Ayushi");
	hs1.add("Vishwkarma");
	hs1.add("Govinda");
	hs1.add("Narayana");
	hs1.add("Rishikesh");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<20;i++)
	{
		hs.add(sc.next());
	}
	System.out.println("Data according to Insertion orders:");//Linked HashSet Preserve insertion order.
	System.out.println(hs);
	
	hs.addAll(hs1);
	System.out.println("Merge of hs and hs1 LinkedHashSet : "+hs);
	
	System.out.println("Check whether the merging of two LinkedHashSet is Occured or not: "+hs.containsAll(hs1));
	
    System.out.println(" To check that whether it is contains element named Ayushi or not : "+hs.contains("Ayushi"));
    
    System.out.println("Checking that whether the set is empty or not: "+hs.isEmpty());
    
  
    //Iterator
    System.out.println("Iteration using Iterator:");
    Iterator i=hs.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
    
    hs.remove("Prakash");
    System.out.println("By Removing the element name Prakash: "+hs);
}

}
