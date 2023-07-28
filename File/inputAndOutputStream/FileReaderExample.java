package File.inputAndOutputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
public static void main(String[]args) throws IOException
{
	FileReader fr=null;
try {
	 fr=new FileReader("FileWriter.txt");
	 int i;
	while((i=fr.read())!=-1)
	{
		System.out.println((char)i);
	}
}catch(Exception e)
{
   System.out.println("Exception occured."+e);	
}finally {
	fr.close();
}
}
}
