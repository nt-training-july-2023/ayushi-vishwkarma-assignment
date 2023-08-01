package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainComparator {
public static void main(String[]args)
{
	ArrayList<EmpComparator> al=new ArrayList<>();
	al.add(new EmpComparator(10,"Kartik",24));
	al.add(new EmpComparator(100,"Ayushi",22));
	al.add(new EmpComparator(9,"Jiya",15));
	
	Collections.sort(al,new IdComparator());
	System.out.println("Sorting based on id: "+al);
	
	Collections.sort(al,new NameComparator());
	System.out.println("Sorting based on Name: "+al);
	
	Collections.sort(al,new AgeComparator());
	System.out.println("Sorting based on Age: "+al);
	
}
}
