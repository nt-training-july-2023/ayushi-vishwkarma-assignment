package Array;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args)
{ int largest=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Size of Array:");
			int n=sc.nextInt();
	int arr[]= new int [n];
	System.out.println("Enter elements of Array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]>largest)
		{
			largest=arr[i];
		}
	}
	System.out.println(largest);
}
}
