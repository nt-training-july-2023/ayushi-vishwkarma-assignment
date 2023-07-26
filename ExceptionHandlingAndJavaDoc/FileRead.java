package ExceptionHandlingAndJavaDoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
public static void main(String []args) throws IOException
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the filename to read");
	String filename=sc.next();
	File f=new File(filename);
	FileReader fr=new FileReader(f);
	
	try {
		
		int i;
		while((i=fr.read())!=-1) {   
		System.out.print((char)i);
		}
		
	}catch(FileNotFoundException e)
	{
	 throw new FileNotFoundException("File doesn't exist.");
	}finally {
		sc.close();
		fr.close();
	}
}
}

