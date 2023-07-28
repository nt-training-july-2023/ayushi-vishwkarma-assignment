package File.inputAndOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class DataInputOutputExample {
public static void main(String []args) throws IOException
{
	FileInputStream fr=null;
	FileOutputStream fw=null;
	DataInputStream dis=null;
	DataOutputStream dos=null;
	try {
		fw=new FileOutputStream("f1.txt");
		dos=new DataOutputStream(fw);
	int a=65;
	dos.write(a);
	}catch(Exception e)
	{
		System.out.println("Exception! " +e);
	}finally {
		fw.close();
		dos.close();
	}
	try {
		fr =new FileInputStream("f1.txt");
		dis=new DataInputStream(fr);
		System.out.println((char)dis.read());
	}catch(Exception e)
	{
		System.out.println("Exception !"+e);
	}finally {
		
	}
}
}
