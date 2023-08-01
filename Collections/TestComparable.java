package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
public static void main(String []args)
{
   ArrayList<StudentComparable>	al=new ArrayList<>();
   al.add(new StudentComparable(101,"Ayushi",22,85));
   al.add(new StudentComparable(100,"Arpita",18,90));
   al.add(new StudentComparable(103,"Jiya",15,88));
   
   Collections.sort(al);
   System.out.println("Sorted list: "+al);
   
}
}
