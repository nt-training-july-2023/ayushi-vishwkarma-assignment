package ExceptionHandlingAndJavaDoc;

import java.util.Scanner;

public class ArrayIntegers {
public static void main(String []args)
{
	int arr[]= {12,19,10,2,3,4,5,6,7,9};
    Scanner sc = new Scanner (System.in);
   
   try {
	   int index=sc.nextInt();
	   System.out.println(arr[index]);
   }catch(IndexOutOfBoundsException e)
   {
	  throw new IndexOutOfBoundsException("Enter appropriate index.");
   }catch(NullPointerException e)
   {
	 if(arr.length==0)  {
		 throw new NullPointerException("Array is Empty.");
	 }
   }
}
}
