package Array;

import java.util.Scanner;

public class SumOfMatrices {
public static void main(String []args)
{
	System.out.println("Enter the size of Matrices");
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int arr1[][]=new int[m][n];
	int arr2[][]=new int[m][n];
	int sum[][]=new int[m][n];
	System.out.println("Enter the elements of first array:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			 arr1[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the elements of second array:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			 arr2[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		sum[i][j]=arr1[i][j]+arr2[i][j];	
		}
	}
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(" "+sum[i][j]);
		}
		System.out.println();
	}
	
}
}
