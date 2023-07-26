package ExceptionHandlingAndJavaDoc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdd {
public static void main(String []args) throws NotEvenNumberException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check whether it is even or not.");
	int num=sc.nextInt();
	try {
		if(num%2==0)
			{
			System.out.println("Number is even.");
		}else {
			throw new NotEvenNumberException("Number is not even!");
		}
    }catch(InputMismatchException e)
	{
    	throw new NotEvenNumberException("Number is not even!");
	}
}
}  
