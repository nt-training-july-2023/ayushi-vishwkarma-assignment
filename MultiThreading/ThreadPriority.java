package MultiThreading;

 class ThreadPriority1 extends Thread{
		String Ack;
	public ThreadPriority1(String ack) {
			this.Ack=ack;
		}
	public void run()
	{
		System.out.println("The name of thread which is reading is " +Thread.currentThread().getName()+" and the acknowledgement : "+Ack+" Priority of thread is : "+Thread.currentThread().getPriority());
		//System.out.println();
	}
	}
	public class ThreadPriority{
		public static void main(String []args)
		{
			ThreadPriority1 obj=new ThreadPriority1("Hello form first thread object ");
			ThreadPriority1 obj2=new ThreadPriority1("Hello form second thread object ");
			ThreadPriority1 obj3=new ThreadPriority1("Hello form third thread object ");
			ThreadPriority1 obj4=new ThreadPriority1("Hello form fourth thread object ");
			ThreadPriority1 obj5=new ThreadPriority1("Hello form fifth thread object ");
			obj.setName("First ");
			obj2.setName("Second ");
			obj3.setName("Third ");
			obj4.setName("Fourth ");
			obj5.setName("Fifth ");
			
			obj.setPriority(10);
			obj2.setPriority(9);
			obj3.setPriority(8);
			obj4.setPriority(7);
			obj5.setPriority(6);
			
			obj.start();
			obj2.start();
			obj3.start();
			obj4.start();
			obj5.start();
		}
	}
