package Basic;

import java.util.Scanner;

public class Airthmetic_Operations {
	public static void main(String [] args)
	{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Addition of " +a+ " and" +b+ " is: "+ (a+b));
System.out.println("Substraction of " +a+ " and" +b+ " is: "+ (a-b));
System.out.println("Multiplication of " +a+ " and" +b+ " is: "+ (a*b));
System.out.println("Division of " +a+ " and" +b+ " is: "+ (a/b));
System.out.println("Modulous of " +a+ " and" +b+ " is: "+ (a%b));

	}
}
