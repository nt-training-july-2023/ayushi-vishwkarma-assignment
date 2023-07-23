package Array;

import java.util.Scanner;

public class RotationOfArray {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Size of Array:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	
    System.out.println("Enter elements of Array");
    int tmp[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    
    }
    System.out.println("Enter the position to rotate array.");
    int pos=sc.nextInt();
    int j=0;
    for(int i=pos;i<n;i++)
    {
    	tmp[j]=arr[i];
    	j++;
    }
    for(int i=0;i<pos;i++)
    {
    	tmp[j]=arr[i];
    	j++;
    }
    for(int i=0;i<n;i++)
    {
    	arr[i]=tmp[i];
    	
    }
    for (int i=0;i<n;i++)
    {
    	System.out.println("Rotated array is: "+arr[i]);
    }
}
}
