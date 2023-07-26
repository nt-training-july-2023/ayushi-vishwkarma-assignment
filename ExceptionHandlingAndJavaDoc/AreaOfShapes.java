package ExceptionHandlingAndJavaDoc;

import java.util.Scanner;

/**
 * It is an Interface that contains a method display_Area();
 */
@FunctionalInterface
interface Parent{
public void display_Area();
}
/**
 * This is a class to calculate Area of different Shapes.
 * @author Ayushi Vishwkarma
 * @version 0.1
 * @since 2023
 */
public class AreaOfShapes implements Parent{
	
	Scanner sc=new Scanner(System.in);
	/**
	 * Parameter to store radius of a circle.
	 */
private double radius;
/**
 * Parameters to store length and breadth of a rectangle.
 */
private double length,breadth;
/**
 * Parameters to store Base and Height of a Triangle.
 */
private double Base,height;
/**
 * 
 * @param radius (It is the argument to store the radius of a circle.)
 * @return Area of Circle.
 
 */

public double area_circle(double radius)
{
	this.radius=radius;
	
	return (3.14*radius*radius);
}
/**
 * 
 * @param Base-It is the First Argument.
 * @param height-It is the Second Argument.
 * @return Area of Triangle.
 */
public double area_Triangle(double Base,double height)
{
	this.Base=Base;
	this.height=height;
	return ((Base*height)/2);
}
/**
 * 
 * @param length-First Argument.
 * @param breadth-Second Argument.
 * @return Area of Rectangle.
 */
public double area_Rectangle(double length , double breadth) {
	this.length=length;
	this.breadth=breadth;
	return (length*breadth);
}
/**
 * This method displays the area of circle , Rectangle, Triangle.

 */
@Override
public void display_Area() 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Radius of circle, length and breadth of rectangle, base and height of Triangle.");
	radius=sc.nextDouble();length=sc.nextDouble();breadth=sc.nextDouble();Base=sc.nextDouble();height=sc.nextDouble();
	System.out.println("Area of Circle: "+area_circle(radius));
	System.out.println("Area of Rectangle: "+area_Rectangle(length,breadth));
	System.out.println("Area of Triangle: "+area_Triangle(Base,height));
}
/**
 * It is a main method.
 * @param args This is Command line Arguments.

 */
public static void main(String []args)
{
	AreaOfShapes obj=new AreaOfShapes();
	obj.display_Area();
}
}
