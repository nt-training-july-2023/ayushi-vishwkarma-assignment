package File;

import java.io.File;
import java.util.ArrayList;

public class ListOfFiles {
public static void main(String[]args)
{
	File f;
   try {
       f=new File("C:\\Users\\ayush\\Documents");
      String[] al;
      al=f.list();
      System.out.println("List of Files and directories:");
      for (int i=0;i<al.length;i++)
      {
    	  int j=1;
    	  System.out.println(j+") "+al[i]);
    	  j++;
      }
   }
      catch(Exception e)
      {
    	  System.out.println("Exception occur!");
      }
      
}
}
