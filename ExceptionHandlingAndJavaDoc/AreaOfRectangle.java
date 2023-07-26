package ExceptionHandlingAndJavaDoc;

import java.util.Scanner;

public class AreaOfRectangle {
	
	public void area(int length,int breadth) throws InvalidDimensionException
	{
		if(length<=0 || breadth <=0)
		{
			throw new InvalidDimensionException("Invalid Dimensions!");
		}
		else {
			System.out.println("Area of Rectangle: "+(length*breadth) );
		}
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and breadth of rectangle.");
	int length=sc.nextInt();
	int breadth=sc.nextInt();
	AreaOfRectangle obj=new AreaOfRectangle();
	try {
	obj.area(length, breadth);
	}catch(InvalidDimensionException e)
	{
		System.out.println("There is an Excepion "+e);
	}
	
}
}
