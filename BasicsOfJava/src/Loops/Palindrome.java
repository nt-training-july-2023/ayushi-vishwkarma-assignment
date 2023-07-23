package Loops;

import java.util.Scanner;

public class Palindrome {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number to check wheter it is Palindrome or not.");
	int n=sc.nextInt();
	int num=n;
	 int sum=0;
		while(n>0)
		{
			int A=n%10;
			sum=(sum*10)+A;
			n=n/10;
		}
		if(num==sum)
		{
			System.out.println("Number is Palindrome.");
		}else
		{
			System.out.println("Not Palindrome!");
		}
}
}
