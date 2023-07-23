package Basic;

import java.util.Scanner;

public class BitwiseOperationandBitShift {
public static void main (String[]args)
{
	int a,b;
	int n=2;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Bitwise and: "+ (a&b));
	System.out.println("Bitwise or: "+ (a|b));
	System.out.println("Bitwise xor: "+ (a^b));
	System.out.println("Bitwise Compliment: "+(~a));
	System.out.println("Bitwise right shift :"+ (a>>n));//(a/2^n)
	System.out.println("Bitwise left Shift: "+ (a<<n));//(a*2^n)
}
}
