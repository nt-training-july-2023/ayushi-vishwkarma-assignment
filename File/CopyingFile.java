package File;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyingFile {
	public void CopyMethod(File f,File f1) throws IOException 
	{
		try {
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter(f1);
			int i;
			while((i=fr.read())!=-1)
			{
				fw.write(i);
			}
			fr.close();
			fw.close();
		}catch(FileNotFoundException e)
		{
			throw new FileNotFoundException("File doesn't exist!");
		}catch(IOException e)
		{
			throw new IOException("Input Output Exception Occur.");
		}
	}
public static void main(String[]args) throws IOException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter source of the file from which the data to be copied.");
    String source=sc.next()	;
    System.out.println("Enter Destination of the file from to copy the data.");
    String destination=sc.next();
    File f=new File(source);
    File f1=new File(destination);
    CopyingFile obj=new CopyingFile();
    obj.CopyMethod(f,f1);
    
}
}
