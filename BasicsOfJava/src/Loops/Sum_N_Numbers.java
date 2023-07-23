package Loops;

import java.util.Scanner;

public class Sum_N_Numbers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value till which you want to perform sum.");
		int n=sc.nextInt();
		int Sum=0;
		for(int i=1;i<=n;i++)
		{
			Sum=Sum+i;
		}
		System.out.println("Sum of "+n+" numbers is: "+Sum);
			
		
	}
}
