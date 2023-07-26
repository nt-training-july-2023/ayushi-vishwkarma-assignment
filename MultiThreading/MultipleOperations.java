package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;



public class MultipleOperations extends Thread{
	public static void main(String[]args)
	{
		ArrayList <Integer> al=new ArrayList<Integer>();
	
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(5);
			al.add(6);
			al.add(7);
			al.add(8);
			al.add(9);
		
		MultipleOperations t1=new MultipleOperations() {
			public void sum(int num)
			{       int sum=0;
					for(int i=1;i<=num;i++)
					{
						sum=sum+i;
					}
					System.out.println("Sum of numbers till "+num+ " is "+sum);
			}
			public void run()
			{
			  sum(20);	
			}
		};
		MultipleOperations t2=new MultipleOperations() {
			public void display(int n)
			{
				for(int i=1;i<10;i++)
				{
					System.out.println(i);
				}
			}
			public void run()
			{
				display(10);
			}
		};
		MultipleOperations t3=new MultipleOperations() {
			public void Reverse(ArrayList al)
			{
				Collections.reverse(al);
				System.out.println("Reversed ArrayList is: "+al);
			}
			public void run()
			{
				Reverse(al);
			}
		};
		MultipleOperations t4=new MultipleOperations() {
			public void Fibonacci(int num)
			{
				int a=0;
				int b=1;
				int c=0;
				System.out.println("Fibonacci series: ");
				for(int i=0;i<num;i++)
				{
					c=a+b;
					System.out.println(c);
					a=b;
					b=c;
				}
			}
			public void run()
			{
				Fibonacci(7);
			}

		};
		
			
			
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
