package ExceptionHandlingAndJavaDoc;

import java.util.Scanner;

public class CheckPassword {
public static void main(String []args) throws InvalidPasswordException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter password");
	String password=sc.next();
	System.out.println(password.length());
	 if(password.length()<8 &&!password.contains("([A-Z]+[0-9])|([0-9]+[A-Z])"))
	 {
		 throw new InvalidPasswordException("Invalid password! Enter Correct password.");
	 }else {
		 System.out.println("welcome");
	 }
	
}
}
