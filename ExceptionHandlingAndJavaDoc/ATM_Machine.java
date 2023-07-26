package ExceptionHandlingAndJavaDoc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM_Machine {

public void BankMethod() throws InvalidInputException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account Balance and Withdrawl Amount.");
	try {
	long Account_bal=sc.nextLong();
	long Withdrawl_Amount=sc.nextLong();
	String bal=Long.toString(Account_bal);
	String amount=Long.toString(Withdrawl_Amount);
	if(Account_bal<=0 || Withdrawl_Amount<=0) {
		throw new InvalidInputException("Invalid Input!");
	}
	}catch(InputMismatchException e)
	{
		throw new InvalidInputException("Invalid Input!(InputMismatch)");
	}
}

public static void main(String[]args) 
{
   ATM_Machine obj = new ATM_Machine();
   try {
   obj.BankMethod();
   }catch(InvalidInputException e)
   {
	   System.out.println("Oops! there is an exception."+e);
   }
}

}