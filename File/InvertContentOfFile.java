package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class InvertContentOfFile {
	public void CopyMethod(File f,File f1) throws IOException 
	{
		ArrayList <String> al=new ArrayList<>();
		try {
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter(f1);
			BufferedWriter bw =new BufferedWriter(fw);
			BufferedReader br=new BufferedReader(fr);
		    String line;
			while((line=br.readLine())!=null)
			{
			 al.add(line);
			}
			Collections.reverse(al);
			for(int i=al.size()-1;i>=0;i--)
			{
		      String str=al.get(i);
		      bw.write(str);
		      bw.newLine();
			}
			System.out.println("Data copied.");
			br.close();
			bw.close();
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
	System.out.println("Enter source file.");
    String source=sc.next()	;
    System.out.println("Enter Destination file.");
    String destination=sc.next();
    File f=new File(source);
    File f1=new File(destination);
    InvertContentOfFile obj=new InvertContentOfFile();
    obj.CopyMethod(f,f1);
    
}
}

