package Array;

import java.util.Scanner;

public class Average {
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array:");
				int n=sc.nextInt();
				int sum=0;
		int arr[]= new int [n];
		System.out.println("Enter elements of Array");
		for(int num:arr)
		{
			num=sc.nextInt();
			sum=sum+num;
				
		}
		System.out.println("Average of numbers is:" +(sum/n));
		
	}	
}
