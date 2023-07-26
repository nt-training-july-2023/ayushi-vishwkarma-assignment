package ExceptionHandlingAndJavaDoc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
public static void main(String []args) throws IOException
{
	try {
		FileReader fr=new FileReader("Aayu.txt.txt");
		int i;
		while((i=fr.read())!=-1) {   
		System.out.print((char)i);
		}
		fr.close();
	}catch(FileNotFoundException e)
	{
	  System.out.println("Exception Occured: "+e);	
	}
}
}
