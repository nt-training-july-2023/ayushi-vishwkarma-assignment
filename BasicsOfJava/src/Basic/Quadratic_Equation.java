package Basic;

import java.util.Scanner;

public class Quadratic_Equation {
public static void main(String[]args)
{
	double a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a ,b and c:");
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	double A=(b*b)-(4*a*c);
	double B=Math.sqrt(A);
	double C=(2*a);
	if(B>0)
	{
		double root1=((-b+B)/C);
		double root2=((-b-B)/C);
		System.out.println("Roots are:"+root1+" "+root2);
	}
	else if(B==0)
	{
		double root=(-b/C);
		System.out.println("Root is: "+root);
		
	}
	else
	{
		System.out.println("Roots:");
		System.out.println((-b/C)+"+i"+B);
		System.out.println((-b/C)+"-i"+B);
		
	}
}
}
