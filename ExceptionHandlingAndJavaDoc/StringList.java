package ExceptionHandlingAndJavaDoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringList {
public static void main(String []args)
{
 List <String> al=new ArrayList<String>();
 al.add(0,"Ayushi");
 al.add(1,"Arpita");
 al.add(2, "Jiya");
al.add(3,"Kartik");
al.add(4,"Madhav");
al.add(5,"Krishna");
al.add(6,"Dwarkadhish");

Scanner sc=new Scanner (System.in);
System.out.println("Enter the index of element you want to access.");
int index=sc.nextInt();
try {
   System.out.println(al.get(index));
}catch(IndexOutOfBoundsException e)
{
	throw new IndexOutOfBoundsException("Index out of bound , enter correct index");
}catch(NullPointerException ex)
{
	if(al.isEmpty())
	{
	  throw new NullPointerException("Empty list");
	}
	
}
}
}
