package Basic;

import java.util.Scanner;

public class Area_of_Triangle {
public static void main(String []args) {
	float base,height;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Base and Height of Triangle.");
	base=sc.nextFloat();
	height=sc.nextFloat();
	System.out.println("Area of Triangle: "+(base*height)/2);
}
}
