package File.inputAndOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterInputOutputStream {
public static void main(String []args) throws IOException {
	FileOutputStream fos=null;
	FileInputStream fis =null;
	FilterInputStream fi=null;
	FilterOutputStream fo=null;
	try {
		fos=new FileOutputStream("f1.text");
		fo=new FilterOutputStream(fos);
		int a=98;
		fo.write(a);
		System.out.println("data Written Successfully.");
		fis=new FileInputStream("f1.text");
		fi=new BufferedInputStream(fis);
		System.out.println((char)fi.read());
	}catch(Exception e)
	{
		System.out.println("Exception "+e);
	}finally {
		fi.close();
		fis.close();
		fo.close();
		fos.close();
	}
}
}
