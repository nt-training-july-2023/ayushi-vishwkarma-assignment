package LambdaExpression;

import java.util.Scanner;


public class VowelsReplacement{
 public static void main(String [] args)
 {
	 String s;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String.");
	 s=sc.nextLine();
	 lambda obj=(str)->{
		 String st=null;
		 for(int i=0;i<s.length();i++)
		 {
			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U')
			 {
				 
				 st= str.replace(str.charAt(i), '#');
				 str=st;
			 }
			
		 }
		 System.out.println("New String without vowels is: "+st);
	 };
	 obj.replace(s);
 }
}


