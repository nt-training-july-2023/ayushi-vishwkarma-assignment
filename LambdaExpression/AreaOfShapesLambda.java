package LambdaExpression;

import java.util.Scanner;

interface Shapes{
	public void area();
}
public class AreaOfShapesLambda {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	Shapes obj=()->{
		System.out.println("Enter radius of circle.");
		int radius=sc.nextInt();
		System.out.println("Area of Circle: "+3.14*radius*radius);
	};
	obj.area();
	Shapes obj1=()->{
		System.out.println("Enter length and breadth of rectangle.");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println("Area of Rectangle: "+length*breadth);
	};
	obj1.area();
	Shapes obj2=()->{
		System.out.println("Enter side of square");
		int side=sc.nextInt();
		System.out.println("Area of Square: "+side*side);
	};
	obj2.area();
	Shapes obj3=()->{
		System.out.println("Enter side of cube.");
		int side=sc.nextInt();
		System.out.println("Area of cube : "+(6*side*side));
	};
	obj3.area();
	Shapes obj4=()->{
		System.out.println("Enter height and radius of Cylinder.");
		int radius=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("Area of Cylinder :"+((2*3.14*radius*height)+(2*3.14*radius*radius)));
	};
	obj4.area();
	Shapes obj5=()->{
		System.out.println("Enter radius of Sphere");
		int radius=sc.nextInt();
		System.out.println("Area of Sphere : "+(4*3.14*radius*radius));
	};
}
}
