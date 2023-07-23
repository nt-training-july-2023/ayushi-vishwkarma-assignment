package Loops;

import java.util.Scanner;

public class Reverse {
public static void main(String []args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to reverse:");
	 n=sc.nextInt();
	 int sum=0;
	while(n>0)
	{
		int A=n%10;
		sum=(sum*10)+A;
		n=n/10;
	}
	System.out.println("Reverse of a number is : "+sum );
}
}
