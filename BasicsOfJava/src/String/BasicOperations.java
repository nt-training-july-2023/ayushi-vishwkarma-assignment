package String;

import java.util.Scanner;

public class BasicOperations {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String str="Ayushi";
	System.out.println("Length of String "+str+" is :"+str.length());
	String str2="Vishwkarma";
	//Concatenation using '+' sign
	System.out.println("Concatenation :"+(str+str2));
	StringBuilder S =new StringBuilder("Arpita");
	
	//Concatenation using append function
	System.out.println("Concatenation using append "+ S.append(str2));
	
	//get a char at given position.
	System.out.println("Enter Position.");
	int pos=sc.nextInt();
	System.out.println("char at position "+pos+" in String "+S+" is: "+S.charAt(pos));
	
	//To check if String starts with a given string or character
	System.out.println("String "+str+"starts with A "+str.startsWith("A"));
	System.out.println("String "+str2+"starts with vish"+str2.startsWith("vish"));
	
	//index of given character or string from string.
	System.out.println("Index of char A in String "+str+" is :"+str.indexOf('A'));
	System.out.println("Index of String pita in String "+S+" is :"+S.indexOf("pita"));
	
	//replace char from string
	System.out.println("Replacing y from "+str+"with J , then the new string is:"+str.replace('y','j'));
	}
}
