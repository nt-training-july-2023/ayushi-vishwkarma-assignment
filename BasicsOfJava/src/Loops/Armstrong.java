package Loops;

import java.util.Scanner;

public class Armstrong {
public static void main(String [] args)
{
	int  n,tmp;
	double sum=0,count=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number.");
	 n=sc.nextInt();
	 double num=n;
	tmp=n;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	while(tmp>0)
	{
		double A=tmp%10;
		sum=sum+(Math.pow(A,count));
		tmp=tmp/10;
	}
	System.out.println(sum);
	if(num==sum)
	{
		System.out.println("Number is armstrong.");
	}
	else
	{
		System.out.println("Not Armstrong!");
	}
}
}
