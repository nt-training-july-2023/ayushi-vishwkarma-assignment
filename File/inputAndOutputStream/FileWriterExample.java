package File.inputAndOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
public static void main(String []args) throws IOException
{
	FileWriter fw = null;
	try {
		 fw=new FileWriter("FileWiter.txt");
		String s="This is FileWriter.txt File.";
		fw.write(s);
	}catch(Exception e)
	{
		System.out.println("Exception occured!"+e);
	}finally {
		fw.close();
	}
}
}
