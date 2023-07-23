package Loops;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String []args)
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Table for "+n+ " is:");
	for(int i:arr)
	{
	  System.out.println(n+" * "+i+" = " +(n*i) );	
	}
	
}
}
