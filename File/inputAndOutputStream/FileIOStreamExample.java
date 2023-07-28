package File.inputAndOutputStream;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class FileIOStreamExample {
public static void main (String[]args) throws IOException 
{
	FileOutputStream fos=null;
	FileInputStream fis =null;
	FileOutputStream fo=null;
	
	try {
	fos=new FileOutputStream("FileOutputStream.xlsx");
	//String str="Ayushi Vishwkarma";
	String str1="ayushi.vishwkarma@nucleusteq.com";
	/*ArrayList<String> s=new ArrayList<>();
	s.add("Ayushi Vishwkarma");
	s.add("ayushi.vishwkarma@nucleusteq.com");
	byte b[]=null;
	for(int i=0;i<s.size();i++)
	{
		
		String str=s.get(i);
	    b=str.getBytes();
	    fos.write(b);
	}
	*/
	byte b[];
	b=str1.getBytes();
	fos.write(b);
	System.out.println("Data written Successfully.");
	}catch(Exception e)
	{
		System.out.println("Exception!");
	}
	finally {
		fos.close();
	}
	try {
		fis=new FileInputStream("FileOutputStream.xlsx");
		fo=new FileOutputStream("FileInputStream.txt");
		
		int i;
		while((i=fis.read())!=-1)
		{
		System.out.print((char)i);
		fo.write(i);
		
		}
		System.out.println();
		System.out.println("Data copied successfully  to text file.");
	}catch(Exception e)
	{
		System.out.println("Exception !"+e);
	}finally {
		fis.close();
		fo.close();
	}
}
}
