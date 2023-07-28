package File.inputAndOutputStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputInputExample implements Serializable {
	 String name ;
	 String email ;
	 int id = 100;
	
public ObjectOutputInputExample(String name, String email, int id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}

public static void main(String []args) throws IOException
{
	ObjectOutputInputExample obj=new ObjectOutputInputExample("Ayushi Vishwkarma","ayushi.vishwkarma@nucleusteq.com",100);
	FileOutputStream fo=null;
	ObjectOutputStream Os=null;
	try {
	fo=new FileOutputStream("ObjectOutput.txt");
	Os= new ObjectOutputStream(fo);
	Os.writeObject(obj);
	}catch(Exception e)
	{
	  System.out.println("Exception Occured!"+e);	
	}
	finally {
		Os.close();
		fo.close();
	}
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	
	try {
		fis=new FileInputStream("ObjectOutput.txt");
		ois=new ObjectInputStream(fis);
		ObjectOutputInputExample obj1=(ObjectOutputInputExample)ois.readObject();
		System.out.println("Name: "+obj1.name);
		System.out.println("Email: "+obj1.email);
		System.out.println("Id: "+obj1.id);
	}catch(Exception e )
	{
		System.out.println("Exception Occured! "+e);
	}finally {
		fis.close();
		ois.close();
	}
}
}
